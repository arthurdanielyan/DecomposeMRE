package com.example.decomposemre.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import com.example.decomposemre.screenA.ScreenAComponent
import com.example.decomposemre.screenA.ScreenAUI
import com.example.decomposemre.screenB.ScreenBComponent
import com.example.decomposemre.screenB.ScreenBUI

@Composable
fun RootUI(
    component: RootComponent
) {
    Children(
        stack = component.childStack,
        animation = stackAnimation(slide()),
    ) {
        when(val childComponent = it.instance) {
            is ScreenAComponent -> ScreenAUI(childComponent)
            is ScreenBComponent -> ScreenBUI(childComponent)
        }
    }
}