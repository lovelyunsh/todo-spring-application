package com.sparta.todospringapplication.domain.todocard.repository

import com.sparta.todospringapplication.domain.todocard.model.TodoCard
import org.springframework.data.jpa.repository.JpaRepository


interface TodoCardRepository : JpaRepository<TodoCard, Long>{

}