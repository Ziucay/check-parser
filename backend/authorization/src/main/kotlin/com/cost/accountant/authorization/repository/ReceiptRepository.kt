package com.cost.accountant.authorization.repository

import com.cost.accountant.authorization.model.Receipt
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ReceiptRepository : JpaRepository<Receipt, Long>{

    override fun getReferenceById(id: Long) : Receipt

    @Query("SELECT s FROM application.receipt r WHERE EXISTS (SELECT 1 from application.user_receipts WHERE user_id = :user_id AND r.id = receipt_id)")
    fun getAllByUserId(@Param("user_id") userId: Long)

}