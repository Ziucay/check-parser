package com.cost.accountant.mock.rest

import com.cost.accountant.models.ReceiptEntry
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicMockController {

    companion object {
        val logger = LoggerFactory.getLogger(BasicMockController::class.java)
    }

    @GetMapping("/mock/basic")
    fun basicGet(): List<ReceiptEntry> {

        val result = listOf(
            ReceiptEntry(
                name = "test name 1",
                price = 100.0,
                weight = null,
                date = "01.01.2001"
            ),
            ReceiptEntry(
                name = "test name 2",
                price = 115.0,
                weight = 1.343,
                date = "01.01.2001"
            ),
            ReceiptEntry(
                name = "test name 3",
                price = 10.0,
                weight = 0.1,
                date = "01.01.2001"
            ),
            ReceiptEntry(
                name = "test name 4",
                price = 500.0,
                weight = null,
                date = "01.01.2001"
            ),
        )
        logger.info(result.toString())
        return result
    }
}