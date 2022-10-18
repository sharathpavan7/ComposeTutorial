package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Row(
        modifier = Modifier.padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_picture ),
            contentDescription = "profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(shape = CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))
        
        Column() {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = msg.message)
        }
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
