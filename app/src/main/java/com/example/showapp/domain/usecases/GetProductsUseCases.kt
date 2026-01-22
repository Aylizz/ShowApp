package com.example.showapp.domain.usecases

import com.example.showapp.domain.models.Product
import com.example.showapp.domain.repository.ProductRepository

class GetProductsUseCases(
    private val repository: ProductRepository
){
    suspend operator fun invoke(): List<Product> {
    return repository.getProducts()
}
}