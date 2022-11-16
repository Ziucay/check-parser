package com.cost.accountant.authorization.model

import javax.persistence.*

@Entity
@Table(name = "receipt", schema = "application")
data class Receipt(
    @Id
    @GeneratedValue
    val id: Long,
    @Column(name = "receipt_json")
    val json: String,
    @Column(name = "is_processed")
    val isProcessed: Boolean
) {
    constructor() : this(1,"1",false)
}
