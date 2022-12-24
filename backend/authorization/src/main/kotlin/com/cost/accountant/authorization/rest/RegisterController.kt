package com.cost.accountant.authorization.rest

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterController {

    companion object {
        val logger = LoggerFactory.getLogger(RegisterController::class.java)
    }

    @PostMapping("/register")
    fun register(@RequestBody body: RegistrationInfo): String {
        if (body.username != "user") {
            return "ok"
        } else {
            return "error"
        }
    }

    data class RegistrationInfo(
        val username: String,
        val password: String
    )
}
