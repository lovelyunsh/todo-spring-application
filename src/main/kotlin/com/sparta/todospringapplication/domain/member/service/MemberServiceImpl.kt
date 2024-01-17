package com.sparta.todospringapplication.domain.member.service

import com.sparta.todospringapplication.domain.member.dto.request.LoginRequest
import com.sparta.todospringapplication.domain.member.dto.request.SignUpRequest
import com.sparta.todospringapplication.domain.member.dto.response.LoginResponse
import com.sparta.todospringapplication.domain.member.dto.response.SignUpResponse
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl:MemberService {

    override fun signUp(signUpRequest: SignUpRequest): SignUpResponse {
        TODO("Not yet implemented")
    }

    override fun login(loginRequest: LoginRequest): LoginResponse {
        TODO("Not yet implemented")
    }


}