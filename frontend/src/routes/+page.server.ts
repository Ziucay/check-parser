import { error } from '@sveltejs/kit';
import type { PageServerLoad } from './$types';

export const load: PageServerLoad = async () => {
    const response = await fetch("http://localhost:8080/mock/basic")
    let data: string = await (await response.text())

    if (data) {
    return data;
    }

    throw error(404, 'Not found');
}