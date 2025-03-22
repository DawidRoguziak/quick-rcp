package rcp.main.tasks.models

import rcp.main.enums.Priority

data class Task(
    val name: String,
    val description: String,
    val priority: Priority
)

fun  Task.taskAsRow() = """<tr><td>$name</td><td>$description</td><td>$priority</td></tr>"""

fun List<Task>.tasksAsTable() = this.joinToString(
    prefix = "<table rules=\"all\">",
    postfix = "</table>",
    separator = "\n",
    transform = Task::taskAsRow
)