package com.amonteiro.a03_kmp_mprolead_g1

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.amonteiro.a03_kmp_mprolead_g1.presentation.ui.screens.SearchScreen


@Preview
@Composable
fun App() {
    MaterialTheme {
        SearchScreen()

//        var showContent by remember { mutableStateOf(false) }
//        Column(
//            modifier = Modifier
//                .background(MaterialTheme.colorScheme.primaryContainer)
//                .safeContentPadding()
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me")
//            }
//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                ) {
//                    Text("Compose: $greeting ")
//                    Text(stringResource(Res.string.my_label))
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Image(painterResource(Res.drawable.error), null)
//                }
//            }
//        }
    }
}