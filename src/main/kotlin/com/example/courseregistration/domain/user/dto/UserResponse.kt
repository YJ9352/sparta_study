package com.example.courseregistration.domain.user.dto

data class UserResponse(
    val id: Long,
    val email: String,
    val nickName: String,
    val role: String,
)
