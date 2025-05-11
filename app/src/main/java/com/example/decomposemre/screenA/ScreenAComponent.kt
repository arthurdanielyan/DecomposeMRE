package com.example.decomposemre.screenA

import com.arkivanov.decompose.ComponentContext

class ScreenAComponent(
    componentContext: ComponentContext,
    private val onNavigateToScreenB: () -> Unit,
) : ComponentContext by componentContext {

    fun onClick() {
        onNavigateToScreenB()
    }
}