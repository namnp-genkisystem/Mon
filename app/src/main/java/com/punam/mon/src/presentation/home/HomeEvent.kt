package com.punam.mon.src.presentation.home



sealed class HomeEvent {
    data class ChangedFrequencyType(val type: FrequencyType) : HomeEvent()
    data object Refresh : HomeEvent()
}