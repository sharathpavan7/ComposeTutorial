package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {

    data class Message(val author: String, val message: String)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MessageCard(Message("Android", "Jetpack Compose"))
            
            /*ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }*/
        }
    }
}

@Composable
fun MessageCard(msg: MainActivity.Message) {
    Column() {
        Text(text = msg.author)
        Text(text = msg.message)
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(MainActivity.Message("Android", "Jetpack Compose"))
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ComposeTutorialTheme {
        Greeting("Android")
    }
}*/
