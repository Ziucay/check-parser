package com.cost.accountant.authorization.model

import javax.persistence.*

@Entity
@Table(name="user", schema = "application")
data class User(
    @Id
    @GeneratedValue
    val id: Long,
    @Column
    val username: String,
    @Column
    val password: String,
    @Column(name = "auth_token")
    val authToken: String,
) {
    constructor() : this(1,"1","1","1")


}
