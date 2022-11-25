import { redirect } from '@sveltejs/kit'
import type { PageServerLoad } from './$types'

export const load: PageServerLoad = async ({ locals, params }) => {
    // redirect user if not logged in
    if (!locals.user) {
        throw redirect(302, '/')
    }

    const response = localStorage.getItem("json");
    const list = JSON.parse(response == null ? "" : response)[0]


    return {
        list: list
    };
}