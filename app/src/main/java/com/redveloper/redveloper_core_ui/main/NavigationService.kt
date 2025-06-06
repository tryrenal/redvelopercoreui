package com.redveloper.redveloper_core_ui.main

import com.redveloper.redveloper_core_ui.R

fun navigationTo(path: CoreUIPath): Int{
    return when(path){
        CoreUIPath.INPUT -> R.id.action_to_input
        CoreUIPath.BUTTON -> R.id.action_to_button
        CoreUIPath.APPBAR -> R.id.action_to_appbar
        CoreUIPath.CHECKED -> R.id.action_to_checked
        CoreUIPath.SEARCH -> R.id.action_to_search
        CoreUIPath.SPINNER -> R.id.action_to_spinner
    }
}