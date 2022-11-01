package com.cost.accountant.authorization.rest

import org.springframework.security.crypto.password.AbstractPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController(val passwordEncoder: PasswordEncoder) {

    var authToken = "token"

    @PostMapping("/login")
    fun tryLogin(@RequestBody requestLoginInfo: LoginInfo): String {
        val loginInfo = LoginInfo(
            username = "user",
            password = passwordEncoder.encode("password")
        )

        if (loginInfo.username == requestLoginInfo.username)
        {
            return loginInfo.password
        }
        else
        {
            return "error"
        }
    }

    @PostMapping("/updateToken")
    fun tryLogin(@RequestBody token: String): String {
        authToken = token
        return "ok"
    }

    data class LoginInfo(
        val username: String,
        val password: String
    )

}