package com.sparta.todospringapplication.common.exception

data class ModelNotFoundException(val modelName:String, val id:Long):RuntimeException(
            "$modelName is not found in id:${id}"
)

