package com.example.omg_by_clark

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.ColorUtils

/**
 * @param h 色相 (0-360) - 决定是什么颜色
 * @param s 饱和度 (0.0-1.0) - 0是灰，1是最浓
 * @param l 亮度 (0.0-1.0) - 0是黑，0.5是纯色，1是纯白
 */
fun hslColor(h: Float, s: Float, l: Float, a: Float = 1f): Color {
    // 使用 Android 系统内置的 HSL 转换工具
    val colorInt = ColorUtils.HSLToColor(floatArrayOf(h, s, l))
    // 转换成 Compose 可用的 Color 对象，并支持透明度
    return Color(colorInt).copy(alpha = a)
}