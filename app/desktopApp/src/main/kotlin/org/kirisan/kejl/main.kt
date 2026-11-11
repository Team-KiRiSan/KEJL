package org.kirisan.kejl

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kirisan Extendable Java Launcher",
    ) {
        App()
    }
}