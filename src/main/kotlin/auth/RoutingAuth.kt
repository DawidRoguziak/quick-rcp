package com.auth

import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.authRouting() {
    routing {
        get("/login") {
            call.respondText("Login page!")
        }
    }
}
