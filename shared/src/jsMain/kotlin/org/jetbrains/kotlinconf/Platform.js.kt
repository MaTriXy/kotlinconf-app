package org.jetbrains.kotlinconf

actual fun generateUserId(): String = "web-js-" + randomUUID()
