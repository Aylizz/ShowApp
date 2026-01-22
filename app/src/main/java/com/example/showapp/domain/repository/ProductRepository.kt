package com.example.showapp.domain.repository

import com.example.showapp.domain.models.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getProductById(productId: Int) : Product
}