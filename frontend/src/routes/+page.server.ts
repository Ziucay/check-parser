import type { PageServerLoad } from './$types';

export const load: PageServerLoad = async () => {
    const response = await fetch('http://numbersapi.com/random/math');
    const text = await response.text()

    return {
        test: text
    };
}