package com.example.testcomposeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcomposeapp.ui.component.MainBannerHomePreview
import com.example.testcomposeapp.ui.component.MainBannerVertikalPreview
import com.example.testcomposeapp.ui.component.MainBottomBarNavPreview
import com.example.testcomposeapp.ui.component.MainTopBarPreview
import com.example.testcomposeapp.ui.component.MainTopCategoryHorizontalPreview
import com.example.testcomposeapp.ui.component.MainTopCategoryPreview
import com.example.testcomposeapp.ui.component.MainTopCategorySecondPreview
import com.example.testcomposeapp.ui.component.MainTopMenuPreview
import com.example.testcomposeapp.ui.theme.TestComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeAppTheme {
                // A surface container using the 'background' color from the theme

//                ScaffoldPage()
//                ScaffoldInputOutput()
//                ListPage()
//                ListPageWithLazyColoum()
//                ButtonWithTextImage()
                MainApp()

            }
//            testPage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainApp() {
    Scaffold(
        bottomBar = { MainBottomBarNavPreview() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            MainTopBarPreview()
            MainTopMenuPreview()
            Divider(
                modifier = Modifier
                    .width(IntrinsicSize.Max)
                    .height(2.dp)
            )
            MainTopCategorySecondPreview()
            MainTopCategoryHorizontalPreview()
            MainTopCategoryPreview()
            MainBannerHomePreview()
            MainBannerVertikalPreview()
        }
    }

}

@Composable
fun ButtonWithTextImage() {
    Button(
        modifier = Modifier.padding(10.dp),
        onClick = { /*TODO*/ }
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Like"
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Favorite")
    }
}

//@Preview
@Composable
fun ListPageWithLazyColoum() {
    LazyColumn {
        itemsIndexed(
            listOf("Merah", "Kuning", "Hijau", "Biru", "Black", "Ungu", "gray")
        ) { indext, item ->
            Text(
                text = "Warna  No ${indext + 1}: $item",
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                style = TextStyle(
                    color = Color.Magenta
                )
            )
        }
    }
//    LazyColumn {
//        items(count = 100) {
//            Text(
//                text = "List contoh $it",
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(10.dp),
//                style = TextStyle(
//                    color = Color.Magenta
//                )
//            )
//        }
//    }
}

@Composable
fun ListPage() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        for (i in 1..50) {
            Text(
                text = "List contoh $i",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                style = TextStyle(
                    color = Color.Magenta
                )
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScaffoldInputOutput() {
    var longState by remember {
        mutableStateOf("")
    }

    var shortState by remember {
        mutableStateOf("")
    }

    var resultState by remember {
        mutableStateOf(0)
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            Text(text = "Toolbar input")
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            TextField(
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Panjang Input")
                },
                value = longState,
                onValueChange = {
                    longState = it
                }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Lebar Input")
                },
                value = shortState,
                onValueChange = {
                    shortState = it
                }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    resultState = longState.toInt() + shortState.toInt()
                }
            ) {
                Text(text = "Submit")
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "Hasilnya adalah : " + resultState.toString(),
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.Blue
                )
            )

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldPage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Toolbar Test",
                        color = Color.Green
                    )
                },
                Modifier.background(Color.Blue)
            )
        },
        bottomBar = {
            BottomAppBar(

            ) {
                Text(text = "BottomBar test")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                /*TODO*/
            }) {

            }
            Text(text = "Float ajaa")
        },
        floatingActionButtonPosition = FabPosition.End
    ) {

    }
}


@Composable
fun testPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column {
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Green,
                text = "Contoh Arba Coloum"
            )
            Row {
                Text(text = "Contoh arbaa row dalam coloum")
            }
        }
    }


    Row {
        Text(text = "Contoh arbaa roow")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun GreetingPreview() {
    TestComposeAppTheme {
        Greeting("Android")
    }
}