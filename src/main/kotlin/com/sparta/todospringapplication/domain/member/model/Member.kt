package com.sparta.todospringapplication.domain.member.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
data class Member(
    @Column(nullable = false)
    val email: String,
    @Column(nullable = false)
    val password: String,
    @Column(nullable = false)
    val nickname: String,

    @CreationTimestamp
    @Column(updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column
    var updatedAt: LocalDateTime? = null
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

}