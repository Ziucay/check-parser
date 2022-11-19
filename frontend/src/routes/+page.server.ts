import type { PageServerLoad } from './$types';

export const load: PageServerLoad = async () => {
    const response = await fetch('http://mock:8080/mock/receipts/list');
    const text = await response.text()

    return {
        test: text
    };
} 
