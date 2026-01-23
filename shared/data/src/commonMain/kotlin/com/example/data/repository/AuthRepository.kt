package com.example.data.repository

import com.example.core.entities.User

interface AuthRepository {
    fun singIn() : User
}