package com.example.composequadrant

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.Compose_bacic_practiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_bacic_practiceTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier) {
    Column(
        modifier= modifier.fillMaxSize()
    ) {

        Row (modifier= modifier.fillMaxHeight(0.5f)){
            ComposeQuadrantCard(
                title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                modifier= modifier
                    .fillMaxWidth(0.5f)
                    .background(color = colorResource(id = R.color.color1))
            )
            ComposeQuadrantCard(
                title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                modifier= modifier
                    .fillMaxWidth(1f)
                    .background(color = colorResource(id = R.color.color2))
            )
        }


        Row(modifier= modifier.fillMaxHeight(1f)) {
            ComposeQuadrantCard(
                title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                modifier= modifier
                    .fillMaxWidth(0.5f)
                    .background(color = colorResource(id = R.color.color3))
            )

            ComposeQuadrantCard(
                title = stringResource(R.string.title4),
                description = stringResource(R.string.description4),
                modifier= modifier
                    .fillMaxWidth(1f)
                    .background(color = colorResource(id = R.color.color4))
            )
        }

    }
}

@Composable
fun ComposeQuadrantCard(title: String, description: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier= modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        // title
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier= Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Justify
        )

        // body
        Text(
            text = description,
            fontSize = TextStyle.Default.fontSize,
            textAlign = TextAlign.Justify,
            modifier= Modifier.alpha(0.8f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    Compose_bacic_practiceTheme {
        ComposeQuadrantApp()
    }
}