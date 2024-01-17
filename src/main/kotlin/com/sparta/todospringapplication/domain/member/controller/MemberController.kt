package com.sparta.todospringapplication.domain.member.controller

import com.sparta.todospringapplication.domain.member.dto.request.LoginRequest
import com.sparta.todospringapplication.domain.member.dto.request.SignUpRequest
import com.sparta.todospringapplication.domain.member.dto.response.LoginResponse
import com.sparta.todospringapplication.domain.member.dto.response.SignUpResponse
import com.sparta.todospringapplication.domain.member.service.MemberService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(

    private val memberService: MemberService
) {


    @PostMapping("/sign-up")
    fun signUp(
        @RequestBody signUpRequest: SignUpRequest
    ): ResponseEntity<SignUpResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(memberService.signUp(signUpRequest))
    }

    @PostMapping("/login")
    fun login(
        @RequestBody loginRequest: LoginRequest
    ): ResponseEntity<LoginResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(memberService.login(loginRequest))
    }

}