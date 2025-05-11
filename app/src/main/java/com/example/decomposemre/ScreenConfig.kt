package com.example.decomposemre

import kotlinx.serialization.Serializable

@Serializable
sealed interface ScreenConfig {

    @Serializable
    data object ScreenA : ScreenConfig

    @Serializable
    data object ScreenB : ScreenConfig
}