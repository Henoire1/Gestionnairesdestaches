package com.example.gestionnairesdestaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gestionnairesdestaches.ui.theme.GestionnairesDesTachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnairesDesTachesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Task(
                        text1 = "All tasks completed",
                        text2 = "Nice work!" ,

                        )
                    }

                }
            }
        }
    }

@Composable
fun Task(text2: String , text1: String,  modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ,
        modifier = Modifier.padding(8.dp)
    ){
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center ,
            modifier = modifier
                .padding(
                    top = 24.dp,
                    bottom  = 8.dp
                )
        )
        Text(
            text = text2,
            textAlign = TextAlign.Center,
            modifier = Modifier

        )
    }
}

@Composable
fun TaskImage(text1: String, text2: String){
    val image = painterResource(R.drawable.ic_task_completed)
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ,
        ){

            Image(
                painter = image,
                contentDescription = null
            )
            Task(
                text1 = text1,
                text2 = text2,
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GestionnairesDesTachesTheme {
        TaskImage("All tasks completed", "Nice work!")
    }
}