package com.example.core.utils

import platform.Foundation.NSLog

actual fun logDebug(tag: String, message: String) {
    NSLog("[$tag] $message")
}