package org.kirisan.kejl

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform