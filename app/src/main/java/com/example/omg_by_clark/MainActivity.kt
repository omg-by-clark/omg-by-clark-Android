// 定义包名，对应你创建项目时的组织结构
package com.example.omg_by_clark

// 导入安卓系统和 Activity 相关的核心类
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
// 导入一堆布局相关的组件
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
// 导入 Compose 的运行时和修饰符工具
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.example.omg_by_clark.ui.theme.OmgByClarkTheme


// MainActivity 是 App 的入口，继承自 ComponentActivity
class MainActivity : ComponentActivity() {
    // 整个 App 启动时第一个执行的方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 开启沉浸式状态栏（让 UI 延伸到状态栏和导航栏下方）
        enableEdgeToEdge()
        // 设置 Activity 的显示内容，这里正式进入 Compose 的世界
        setContent {
            // 使用你项目自定义的主题（在 ui/theme 目录下定义）
            OmgByClarkTheme {
                // Scaffold 是一个标准物料布局结构，提供基础的布局容器
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // 调用下面定义的 Greeting 组件，传入 name 参数
                    // innerPadding 自动处理了状态栏等遮挡，让文字显示在安全区域
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// {}
// @Composable 标记这是一个 UI 组件函数（首字母大写是 Compose 的规范）
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val brandColor = hslColor(355f, 1.0f, 0.64f)

    // Text 是文本组件，相当于网页里的 <span> 或 <p>
    Row ( modifier = Modifier.padding(16.dp) ) {
        Text ( text = "欢迎来到 ", modifier = Modifier )
        Text (
            text = "omg-by-Clark",
            modifier = Modifier,
            color = brandColor,
            fontFamily = FontFamily.Monospace
        )
        Text ( text = "！", modifier = Modifier )
    }
}

// @Preview 标记这个函数仅用于 Android Studio 的 Split 预览，不会打包进 App
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // 预览时也包裹在你的主题里，确保看到的颜色和正式环境一致
    OmgByClarkTheme {
        Greeting("World")
    }
}