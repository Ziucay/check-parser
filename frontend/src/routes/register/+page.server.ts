import {invalid, redirect} from '@sveltejs/kit'
import type {Action, Actions, PageServerLoad} from './$types'
import bcrypt from 'bcrypt'

// using an enum for user roles to avoid typos
// if you're not using TypeScript use an object
enum Roles {
    ADMIN = 'ADMIN',
    USER = 'USER',
}

export const load: PageServerLoad = async () => {
    // todo
}

const register: Action = async ({request}) => {
    const data = await request.formData()
    const username = data.get('username')
    const password = data.get('password')

    if (
        typeof username !== 'string' ||
        typeof password !== 'string' ||
        !username ||
        !password
    ) {
        return invalid(400, {invalid: true})
    }

    const res = await fetch('http://localhost:8090/register', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            username: username,
            password: password
        })
    })

    const result = await res.text()

    if (result === 'ok') {
        console.log('ok')
        throw redirect(303, '/login')
    } else
        return invalid(400, {invalid: true})
}

export const actions: Actions = {register}