package com.redveloper.redveloper_core_ui.main

enum class CoreUIPath (
    val path: String
){
    BUTTON("button"),
    INPUT("input"),
    APPBAR("appbar")
}

fun getCoreUIPath(path: String): CoreUIPath? {
    return enumValues<CoreUIPath>().firstOrNull { it.path == path }
}