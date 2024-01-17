package com.sparta.todospringapplication.domain.todocard.controller

import com.sparta.todospringapplication.domain.todocard.dto.request.CreateTodoCardRequest
import org.springframework.web.bind.annotation.*

@RequestMapping("/todo-cards")
@RestController
class TodoCardController {

    @GetMapping("/mine")
    fun getMyTodoCardList(
//        memberId:Long
    ) {

    }

    @GetMapping("/all")
    fun getAllTodoCardList(
//        memberId:Long
    ) {

    }

    @GetMapping("/{todoCardId}")
    fun getTodoCard(
        @PathVariable todoCardId: String
    ) {

    }

    @PostMapping
    fun createTodoCard(
        @RequestBody createTodoCardRequest: CreateTodoCardRequest
    ) {

    }

    @PutMapping("/{todoCardId}")
    fun updateTodoCard(
//        memberId:Long,
        @PathVariable todoCardId: String
    ) {

    }

    @DeleteMapping("/{todoCardId}")
    fun deleteTodoCard(
//        memberId:Long,
        @PathVariable todoCardId: String
    ) {

    }

}