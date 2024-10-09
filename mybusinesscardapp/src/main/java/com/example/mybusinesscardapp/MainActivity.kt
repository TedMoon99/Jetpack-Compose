package com.example.mybusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybusinesscardapp.ui.theme.Compose_bacic_practiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_bacic_practiceTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize() // 화면 전체
            .background(color = Color(0xFFFAF0E6))
            .padding(16.dp)
    ) {
        ContentCard(
            title = "What is Lorem Ipsum?",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n"
        )
    }
}

@Composable
fun ContentCard(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 16.dp), // 너비 전체
    ) {
//            var isClicked by remember { mutableStateOf(false) } // 클릭 상태 변수

        ElevatedCard(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(),
//                    .clickable { isClicked = !isClicked }, // 클릭시 상태 변경
            colors = CardDefaults.cardColors(containerColor = Color(0xFF99CC66)), // 카드 배경색 설정
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        ) {
            val image = painterResource(id = R.drawable.android_logo)

            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(fraction = 0.4f),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    modifier = modifier
                        .fillMaxWidth(fraction = 0.6f)
                        .background(Color(0xFF0A3711)),
                    painter = image,
                    contentDescription = null,
                )
            }

            Text(
                text = title,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp, start = 8.dp, end = 8.dp)
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Compose_bacic_practiceTheme {
        BusinessCardApp()
    }
}