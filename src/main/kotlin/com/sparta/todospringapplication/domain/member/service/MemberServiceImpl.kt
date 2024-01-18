package com.sparta.todospringapplication.domain.member.service

import com.sparta.todospringapplication.domain.member.dto.request.LoginRequest
import com.sparta.todospringapplication.domain.member.dto.request.SignUpRequest
import com.sparta.todospringapplication.domain.member.dto.response.LoginResponse
import com.sparta.todospringapplication.domain.member.dto.response.SignUpResponse
import com.sparta.todospringapplication.domain.member.model.Member
import com.sparta.todospringapplication.domain.member.repository.MemberRepository
import com.sparta.todospringapplication.infra.security.jwt.JwtHelper
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberRepository: MemberRepository,
    private val passwordEncoder: PasswordEncoder,
    private val jwtHelper: JwtHelper
) : MemberService {

    override fun signUp(request: SignUpRequest): SignUpResponse {
        return memberRepository.save(
            Member(
                email = request.email,
                password = passwordEncoder.encode(request.password),
                nickname = request.nickname
            )
        ).toResponse()
    }

    override fun login(request: LoginRequest): LoginResponse {

        val member = memberRepository.findByEmail(request.email)
        if (!passwordEncoder.matches(request.password, member.password)) {
            // todo exception 추가
            throw RuntimeException()
        }

        return LoginResponse(
            token = jwtHelper.generateAccessToken(
                subject = member.id.toString(),
                email = member.email
            )
        )
    }
}

fun Member.toResponse(): SignUpResponse {
    return SignUpResponse(
        email = email,
        nickname = nickname
    )
}