package com.cost.accountant.authorization.repository

import com.cost.accountant.authorization.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<User, Long> {

    override fun getReferenceById(id: Long) : User

    fun findUserByUsername(username: String) : User

    @Query("UPDATE application.user u SET u.auth_token = :auth_token WHERE u.username = :username")
    fun updateUserAuthToken(@Param("username") username: String, @Param("auth_token") authToken: String) : User

    @Query("INSERT INTO application.user (username, password, auth_token) VALUES (:username, :password, :auth_token)")
    fun addUser(@Param("username") username: String, @Param("password") password: String, @Param("auth_token"))

}