package com.sparta.todospringapplication.domain.member.repository

import com.sparta.todospringapplication.domain.member.model.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
    fun findByEmail(email: String): Member

}