package com

import com.auth.authRouting
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureHTTP()
    // configureSockets()
    configureSecurity()
    //data
    configureSerialization()
    configureDatabases()

    //routing config
    configureRouting()
    authRouting()
}
