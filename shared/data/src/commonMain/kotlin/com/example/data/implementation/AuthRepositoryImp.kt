package com.example.data.implementation

import com.example.core.entities.User
import com.example.core.repository.AuthRepository
import io.github.jan.supabase.SupabaseClient

class AuthRepositoryImp(supabaseClient: SupabaseClient) : AuthRepository{
    override fun singIn(): User {
        return User(
            id = 0,
            nama = "Alice",
            mail = "alice@gmail.com",
            phone = "123456789"
        )
    }

}