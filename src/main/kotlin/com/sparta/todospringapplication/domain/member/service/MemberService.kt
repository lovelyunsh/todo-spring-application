package com.sparta.todospringapplication.domain.member.service

import com.sparta.todospringapplication.domain.member.dto.request.LoginRequest
import com.sparta.todospringapplication.domain.member.dto.request.SignUpRequest
import com.sparta.todospringapplication.domain.member.dto.response.LoginResponse
import com.sparta.todospringapplication.domain.member.dto.response.SignUpResponse


interface MemberService {

    fun signUp(signUpRequest: SignUpRequest): SignUpResponse

    fun login(loginRequest: LoginRequest): LoginResponse


}