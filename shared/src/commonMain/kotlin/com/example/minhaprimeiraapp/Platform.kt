package com.example.minhaprimeiraapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform