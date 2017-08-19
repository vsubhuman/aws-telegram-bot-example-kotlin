package com.vsubhuman.telegram.kt_example

fun <A,R> A?.map(code: (A) -> R): R? =
        if (this != null) code(this) else null