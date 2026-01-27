package com.example.data.implementation

import com.example.core.entities.Brand
import com.example.core.repository.ProductRepository
import com.example.core.entities.Product
import com.example.core.entities.Style
import com.example.data.model.ColorDAO
import com.example.data.model.MultimediaDAO
import com.example.data.model.ProductDAO
import com.example.data.model.TypeMultimediaDAO
import io.github.jan.supabase.SupabaseClient

class MockProductRepositoryImp(supabaseClient: SupabaseClient): ProductRepository {
    /*
    val products = listOf(ProductDAO(
        id = 0,
        name = "Camiseta 1",
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
    ),
        ProductDAO(
            id = 0,
            name = "Camiseta 2",
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
                    id = 1,
                    multimediaURL = "https://mundotextil.com/tienda/454-large_default/camiseta-fruit-of-the-loom-610360.jpg",
                    isPrincipal = true,
                    type = TypeMultimedia.IMAGE
                )
            )
        ),
        ProductDAO(
            id = 1,
            name = "Camiseta 3",
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
                    id = 1,
                    multimediaURL = "https://mundotextil.com/tienda/454-large_default/camiseta-fruit-of-the-loom-610360.jpg",
                    isPrincipal = true,
                    type = TypeMultimedia.IMAGE
                )
            )
        ))*/
    val products = listOf(
        ProductDAO(
            id = 0,
            name = "Camiseta 1",
            price = 10.4,
            discountPrice = 9.00,
            brandId = 0,
            styleId = 0,
            timesBougth = 5,
            numLikes = 42
        ),
        ProductDAO(
            id = 1,
            name = "Camiseta 2",
            price = 13.4,
            brandId = 1,
            styleId = 1,
            timesBougth = 5,
            numLikes = 42
        )
    )
    val brands = listOf(
        Brand(
            id = 0,
            name = "Adidas",
            logoImage = ""
        ),
        Brand(
            id = 1,
            name = "Nike",
            logoImage = ""
        )
    )

    val styles = listOf(
        Style(
            id = 0,
            name = "Casual"
        ),
        Style(
            id = 1,
            name = "MichelleIano"
        )
    )

    val colors = listOf(
        ColorDAO(
            id = 0,
            name = "Rojo",
            hexCode = "#FF0000"
        ),
        ColorDAO(
            id = 1,
            name = "Verde",
            hexCode = "#00FF00"
        ),
        ColorDAO(
            id = 2,
            name = "Azul",
            hexCode = "#0000FF"
        )
    )
    val multimedia = listOf(
        MultimediaDAO(
            idMultimedia = 0,
            multimediaURL = "https://www.joma-sport.com/dw/image/v2/BFRV_PRD/on/demandware.static/-/Sites-joma-masterCatalog/default/dw0e82cc45/images/medium/101739.100_1.jpg?sw=900&sh=900&sm=fit",
            isPrincipal = true,
            idType = 0,
        ),
        MultimediaDAO(
            idMultimedia = 1,
            multimediaURL = "https://www.joma-sport.com/dw/image/v2/BFRV_PRD/on/demandware.static/-/Sites-joma-masterCatalog/default/dw0e82cc45/images/medium/101739.100_1.jpg?sw=900&sh=900&sm=fit",
            isPrincipal = false,
            idType = 0,
        ),
        MultimediaDAO(
            idMultimedia = 0,
            multimediaURL = "https://mundotextil.com/tienda/454-large_default/camiseta-fruit-of-the-loom-610360.jpg",
            isPrincipal = true,
            idType = 0,
        ),
        MultimediaDAO(
            idMultimedia = 1,
            multimediaURL = "https://mundotextil.com/tienda/454-large_default/camiseta-fruit-of-the-loom-610360.jpg",
            isPrincipal = false,
            idType = 0,
        ),
    )

    val multimediaTypes = listOf(
        TypeMultimediaDAO(
            id = 0,
            name = "IMAGEN"
        )
    )

    override fun getProducts(): List<Product> {
        return products.map { productDTO -> productDTO.toEntity(
            brand = brands[productDTO.brandId],
            style = styles[productDTO.styleId],
            multimediaList = TODO(),
            clothingSizeList = TODO(),
            productColorList = TODO()
        ) }
    }

    override fun getTrendingProducts(): List<Product> {
        return products.sortedByDescending { productDTO -> productDTO.numLikes }.map { productDTO -> productDTO.toEntity() }
    }

    override fun getNewProducts(): List<Product> {
        return products.sortedByDescending { productDTO -> productDTO.id }.map { productDTO -> productDTO.toEntity() }
    }

    override fun getProductByBrannd(): List<Product> {
    }

    override fun getProductsByDiscount(): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProductById(productId: Int): Product {
        TODO("Not yet implemented")
    }

    override fun getProductByStyle(styleId: Int): Product {
        TODO("Not yet implemented")
    }
}