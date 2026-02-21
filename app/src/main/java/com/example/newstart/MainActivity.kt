package com.example.newstart

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.experimental.Experimental
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newstart.ui.ExpandableCard
import com.example.newstart.ui.ExpandableCardPreview
import com.example.newstart.ui.TextFieldFile
import com.example.newstart.ui.theme.NewStartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewStartTheme {

            }
        }
    }
}


@Composable
fun CustomText(text: String, num: Int) {
    Text(
        text = ("$text $num")
    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NewStartTheme {
//        Column(
//            modifier=Modifier.fillMaxSize(),
//            horizontalAlignment= Alignment.CenterHorizontally,
//            verticalArrangement= Arrangement.Center
//        ) {
//            Surface(
//                modifier=Modifier
//                .width(40.dp)
//                .height(20.dp),
//                color= MaterialTheme.colorScheme.primary
//            ) { }
//            Spacer(modifier=Modifier.height(5.dp))
//            Surface(
//                modifier=Modifier
//                .width(40.dp)
//                .height(20.dp),
//                color= MaterialTheme.colorScheme.primary
//            ) { }
//        }
//    }
//}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NewStartTheme {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//
//        ) {
//            Box(
//                modifier = Modifier
//                    .height(100.dp)
//                    .width(200.dp)
//                    .background(color = MaterialTheme.colorScheme.secondary),
//                contentAlignment = Alignment.Center
//            ) {
//                // with this we can select the text.
//                SelectionContainer {
//
//                    Column {
//                        Text(text = "Hello Kshitiz", color = Color.White, fontSize = 30.sp)
//                        DisableSelection {
//                            Text(text = "Hello Kshitiz", color = Color.White, fontSize = 30.sp)
//                        }
//                    }
//                }
//            }
//        }
//    }
//}




