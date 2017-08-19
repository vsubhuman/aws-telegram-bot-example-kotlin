package com.vsubhuman.telegram.kt_example.model

import com.vsubhuman.telegram.kt_example.map
import java.time.Instant
import java.time.format.DateTimeFormatter

data class Update(val message: Message?)
data class Message(val date: Long, val text: String, val chat: Chat)
data class Chat(val id: Long)

fun getFormattedUpdateTime(u: Update): String {
    return u.message?.date.map {
        val instant = Instant.ofEpochSecond(it)
        DateTimeFormatter.ISO_INSTANT.format(instant)
    } ?: "<unknown>"
}