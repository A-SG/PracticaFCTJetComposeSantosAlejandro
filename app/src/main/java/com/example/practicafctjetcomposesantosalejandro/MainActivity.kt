package com.example.practicafctjetcomposesantosalejandro

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContenedorVista()
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContenedorVista() {
    Scaffold(
        topBar = { Toolbar() },
        content = { App()}
    )
}

@Preview
@Composable
fun Toolbar() {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .size(120.dp),
        title = {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Column() {
                    Button(
                        onClick = { /*....*/ },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(R.color.white)
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.activityMain_toolbar_tvConsumo),
                            color = colorResource(id = R.color.green),
                        )
                    }

                    Text(
                        text = stringResource(id = R.string.activityMain_toolbar_tvFacturas),
                        color = colorResource(id = R.color.black)
                    )
                }
                Image(painter = painterResource(id = R.drawable.icono_filtro), contentDescription = null, modifier = Modifier
                    .size(48.dp, 48.dp))
            }

        },
        backgroundColor = colorResource(id = R.color.white),
        )
}


@Preview
@Composable
fun App(){
    Image(painter = painterResource(id = R.drawable.icono_filtro), contentDescription = null, modifier = Modifier
        .size(48.dp, 48.dp))
}









