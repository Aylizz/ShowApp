package com.example.showapp.data.mapperss

import com.example.showapp.data.modeel.ProductDto
import com.example.showapp.data.modeel.RatingDto
import com.example.showapp.domain.models.Product
class ProductMapper {

}
fun ProductDto.toDomain(): Product {
    return Product(
        id = this.id ?: -1
        title = this.title ?: "",
        price = this.price ?: 0.0,
        description = this.description ?: "",
        category = this.category ?: "",
        image = this.image ?: "",
        rating = this.rating?.toDomain() ?: Rating.empty()

    )
}

fun RatingDto.toDomain(): Rating {
    return Rating(
        rate = this.rate ?: 0.0,
        count = this.count ?: 0
    )
}