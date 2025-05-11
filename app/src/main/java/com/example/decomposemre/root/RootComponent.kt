package com.example.decomposemre.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pushNew
import com.example.decomposemre.ScreenConfig
import com.example.decomposemre.screenA.ScreenAComponent
import com.example.decomposemre.screenB.ScreenBComponent

class RootComponent(
    componentContext: ComponentContext
) : ComponentContext by componentContext {

    private val stackNavigation = StackNavigation<ScreenConfig>()
    val childStack = childStack(
        source = stackNavigation,
        serializer = ScreenConfig.serializer(),
        handleBackButton = true,
        initialConfiguration = ScreenConfig.ScreenA,
        childFactory = { config, childContext ->
            when (config) {
                ScreenConfig.ScreenA -> ScreenAComponent(
                    componentContext = childContext,
                    onNavigateToScreenB = {
                        stackNavigation.pushNew(ScreenConfig.ScreenB)
                    }
                )
                ScreenConfig.ScreenB -> ScreenBComponent(
                    componentContext = childContext
                )
            }
        }
    )
}