import type { Handle } from '@sveltejs/kit';

export const handle: Handle = async ({ event, resolve }) => {
	// get cookies from browser
	const session = event.cookies.get('session');

	if (!session) {
		// if there is no session load page as normal
		return await resolve(event);
	}

	const authenticationRequest = await fetch('http://auth:8080/authenticate', {
		method: 'POST',
		headers: {
			Accept: 'application/json',
			'Content-Type': 'text/plain'
		},
		body: session
	});

	const authResult = await authenticationRequest.json();

	// if `user` exists set `events.local`
	if (authResult.username != 'error') {
		event.locals.user = {
			name: authResult.username
		};
	}

	// load page as normal
	return await resolve(event);
};
