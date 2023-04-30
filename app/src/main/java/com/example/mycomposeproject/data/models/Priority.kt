package com.example.mycomposeproject.data.models


import androidx.compose.ui.graphics.Color
import com.example.mycomposeproject.ui.theme.HighPriorityColor
import com.example.mycomposeproject.ui.theme.LowPriorityColor
import com.example.mycomposeproject.ui.theme.MediumPriorityColor
import com.example.mycomposeproject.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}