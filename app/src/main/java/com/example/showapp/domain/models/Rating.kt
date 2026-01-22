package com.example.showapp.domain.models

data class Rating(
    val rate: Double,
    val count: Int
)
companion object{
    fun empty(): Rating (
        return Rating(
            rate = 0.5,
            count = 0
        )
    )
}

