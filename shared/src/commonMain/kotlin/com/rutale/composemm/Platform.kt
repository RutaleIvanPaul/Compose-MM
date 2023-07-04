package com.rutale.composemm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform