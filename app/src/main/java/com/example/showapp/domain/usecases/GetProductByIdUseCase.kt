package com.example.showapp.domain.usecases

import com.example.showapp.domain.models.Product
import com.example.showapp.domain.repository.ProductRepository
class GetProductByIdUseCase (
    private val repository: ProductRepository
){
    suspend operator fun invoke(productId: Int): Product =
        repository.getProductById(productId = productId)
    }
}