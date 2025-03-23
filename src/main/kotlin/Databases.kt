package com

import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases() {
    val config = environment.config
    val url = config.property("database.url").getString()
    val user = config.property("database.user").getString()
    val password = config.property("database.password").getString()


    Database.connect(
        url = url,
        user = user,
        password = password
    )
}

