package com.example.core.repository

import com.example.core.entities.User

interface AuthRepository {
    fun singIn() : User
}