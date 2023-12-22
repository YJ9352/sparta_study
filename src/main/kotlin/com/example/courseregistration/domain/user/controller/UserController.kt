package com.example.courseregistration.domain.user.controller

import com.example.courseregistration.domain.user.dto.SignUpRequest
import com.example.courseregistration.domain.user.dto.UpdateUserProfileRequest
import com.example.courseregistration.domain.user.dto.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @PostMapping("/signup")
    fun singUp(@RequestBody signUpRequest: SignUpRequest): ResponseEntity<UserResponse> {
        TODO()
    }

    @PutMapping("/users/{userId}/profile")
    fun updateUserProfile(@PathVariable userId: Long,
                          @RequestBody updateUserProfileRequest: UpdateUserProfileRequest
    ): ResponseEntity<UserResponse> {
        TODO()
    }

}