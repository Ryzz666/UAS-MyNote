package com.rury.mynote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rury.mynote.ui.theme.MyNoteTheme
import com.rury.mynote.navigation.MyNoteNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNoteTheme {
                MyNoteNavGraph()
            }
        }
    }
}