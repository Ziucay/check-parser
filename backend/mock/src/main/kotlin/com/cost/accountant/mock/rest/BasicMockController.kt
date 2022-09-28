package com.cost.accountant.mock.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicMockController {

    @GetMapping("/mock/basic")
    fun BasicGet() : String
    {
        return "This is a basic mock"
    }
}