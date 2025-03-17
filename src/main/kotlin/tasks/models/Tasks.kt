package rcp.main.tasks.models

import rcp.main.enums.Priority

data class Tasks(
    val name: String,
    val description: String,
    val priority: Priority
)
