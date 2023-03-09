import { invalid, redirect } from '@sveltejs/kit';
import bcrypt from 'bcrypt';
import type { Action, Actions, PageServerLoad } from './$types';

export const load: PageServerLoad = async ({ locals }) => {
	if (locals.user) {
		throw redirect(302, '/');
	}
};

const login: Action = async ({ cookies, request }) => {
	const data = await request.formData();
	const username = data.get('username');
	const password = data.get('password');

	if (typeof username !== 'string' || typeof password !== 'string' || !username || !password) {
		return invalid(400, { invalid: true });
	}

	const retrievedPass = await fetch('http://back:8080/login', {
		method: 'POST',
		headers: {
			Accept: 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify({
			username: username,
			password: password
		})
	});

	const retrievedText = await retrievedPass.text();

	if (retrievedText === 'error') {
		return invalid(400, { credentials: true });
	}
    console.log(retrievedText)
    console.log(password)
	const userPasswordEqual = await bcrypt.compare(password, retrievedText);

	if (!userPasswordEqual) {
		return invalid(400, { credentials: true });
	}

	const authToken = crypto.randomUUID();

	const updateToken = await fetch('http://back:8080/updateToken', {
		method: 'POST',
		headers: {
			Accept: 'text/plain',
			'Content-Type': 'text/plain'
		},
		body: authToken
	});

	cookies.set('session', authToken, {
		// send cookie for every page
		path: '/',
		// server side only cookie so you can't use `document.cookie`
		httpOnly: true,
		// only requests from same site can send cookies
		// https://developer.mozilla.org/en-US/docs/Glossary/CSRF
		sameSite: 'strict',
		// only sent over HTTPS in production
		secure: process.env.NODE_ENV === 'production',
		// set cookie to expire after a month
		maxAge: 60 * 60 * 24 * 30
	});

	// redirect the user
	throw redirect(302, '/');
};

export const actions: Actions = { login };
