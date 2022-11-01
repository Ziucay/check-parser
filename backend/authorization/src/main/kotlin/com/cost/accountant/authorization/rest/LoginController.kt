package com.cost.accountant.authorization.rest

import org.slf4j.LoggerFactory
import org.springframework.security.crypto.password.AbstractPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.*

@RestController
class LoginController(val passwordEncoder: PasswordEncoder) {

    companion object {
        val logger = LoggerFactory.getLogger(LoginController::class.java)
    }

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

    @PostMapping("/authenticate")
    @ResponseBody
    fun authenticate(@RequestBody token: String): LoginInfo {
        logger.info(authToken)
        if (token == authToken)
            return LoginInfo(
                username = "user",
                password = passwordEncoder.encode("password")
            )
        else
            return LoginInfo(
                username = "error",
                password = "error"
            )
    }

}