package com.bb.java.spring.kotlin.javaspring.member

interface MemberRepository {
    fun save(member: Member)
    fun findById(memberId: Long): Member
}