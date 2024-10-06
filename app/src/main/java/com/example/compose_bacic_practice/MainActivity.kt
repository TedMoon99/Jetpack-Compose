package com.example.compose_bacic_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_bacic_practice.ui.theme.Compose_bacic_practiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_bacic_practiceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialApp()
                }
            }
        }
    }
}

@Composable
fun TutorialApp() {
    TutorialBody(
        title = stringResource(R.string.text1),
        shortDescription = stringResource(R.string.text2),
        longDescription = stringResource(R.string.text3),
        painterResource(id = R.drawable.bg_compose_background)
    )
}
@Composable
fun TutorialBody(title:String, shortDescription: String, longDescription:String, imagePainter: Painter, modifier: Modifier = Modifier) {
    Column(modifier= modifier) {
        // Image
        Image(
            painter = imagePainter,
            contentDescription = null)
        // Text1
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        // Text2
        Text(
            text = shortDescription,
            // Justify : 텍스트 줄 끝이 부드러운 줄 바꿈으로 끝나는 경우, 해당 줄을 컨테이너의 너비에 맞게 늘립니다. 강제 줄 바꿈으로 끝나는 줄은 시작 가장자리 쪽으로 정렬됩니다.
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        )

        // Text3
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_bacic_practiceTheme {
        TutorialApp()
    }
}