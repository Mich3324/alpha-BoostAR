package com.example.data.implementation

import com.example.core.entities.Brand
import com.example.core.entities.ClothingSize
import com.example.core.entities.Multimedia
import com.example.core.entities.TypeMultimedia
import com.example.core.repository.ProductRepository
import com.example.core.entities.Product
import com.example.core.entities.ProductColor
import com.example.core.entities.Style
import com.example.data.model.ProductDAO
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.postgrest

class ProductRepositoryImp(private val supabaseClient: SupabaseClient): ProductRepository {
    private val sql = supabaseClient.postgrest

    override suspend fun getProducts(): List<Product> {
        TODO("Not yet implemented")
    }

}