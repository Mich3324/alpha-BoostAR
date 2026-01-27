package com.example.data.implementation

import com.example.core.entities.Multimedia
import com.example.core.entities.TypeMultimedia
import com.example.core.repository.ProductRepository
import com.example.core.entities.Product
import com.example.data.model.ProductDAO
import io.github.jan.supabase.SupabaseClient

class ProductRepositoryImp(supabaseClient: SupabaseClient): ProductRepository {
    override fun getProducts(): List<Product> {

        val products = listOf(ProductDAO(
            id = 0,
            name = "Camiseta",
            price = 10.25,
            brand = "Marca 1",
            numLikes = 4309,
            modelURL = "",
            multimedia = listOf(
                Multimedia(
                    id = 0,
                    multimediaURL = "https://www.joma-sport.com/dw/image/v2/BFRV_PRD/on/demandware.static/-/Sites-joma-masterCatalog/default/dw0e82cc45/images/medium/101739.100_1.jpg?sw=900&sh=900&sm=fit",
                    isPrincipal = true,
                    type = TypeMultimedia.IMAGE
                ),
                Multimedia(
                    id = 0,
                    multimediaURL = "https://mundotextil.com/tienda/454-large_default/camiseta-fruit-of-the-loom-610360.jpg",
                    isPrincipal = true,
                    type = TypeMultimedia.IMAGE
                )
            )
        ))
        return products.map { productDTO -> productDTO.toEntity() }
    }
}