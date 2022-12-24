import { redirect } from '@sveltejs/kit';
import type { PageServerLoad } from './$types';

export const load: PageServerLoad = async ({ locals, params }) => {
	// redirect user if not logged in
	if (!locals.user) {
		throw redirect(302, '/');
	}

	const response = await fetch(`http://mock:8080/mock/receipt?id=${params.receiptId}`);
	const list = await response.json();

	return {
		list: list
	};
};
