package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Card (

            modifier = modifier
                .height(50.dp)
                .align(Alignment.TopEnd)
                .width(120.dp),
            shape = RoundedCornerShape(
                bottomStart = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE803FD)
            )


        ){  }
        Card (
            modifier = modifier
                .height(50.dp)
                .align(Alignment.BottomStart)
                .width(120.dp),
            shape = RoundedCornerShape(
                topEnd = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE803FD)
            )
        ){  }
        Column (
            modifier = modifier
                .fillMaxSize()
                .padding(20.dp)
                .padding(top = 250.dp)
                .background(color = Color.Transparent),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start

        ) {
            Text(
                text = stringResource(
                    R.string.login
                ),
                fontSize = 45.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFDE0FF2)
            )
            Text(
                text = stringResource(
                    R.string.faca_login
                ),
                color = Color(0xFF868686)
            )
            Column (
                modifier = modifier
                    .fillMaxWidth()
                    .height(600.dp)
                    .padding(top = 38.dp)
                    .background(color = Color.Transparent),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                OutlinedTextField(
                    value = "example@gmail.com",
                    onValueChange = {},
                    modifier = modifier
                        .fillMaxWidth(),

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription ="",
                            tint = Color(0xFFDE0FF2)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.email
                            )
                        )
                    }

                )
                OutlinedTextField(
                    value = "************",
                    onValueChange = {},
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFFDE0FF2)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.senha
                            )
                        )
                    }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFFDE0FF2)),
                    modifier = modifier
                        .align(Alignment.End)
                        .padding(top = 60.dp)
                        .width(120.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(
                        bottomStart = 10.dp,
                        bottomEnd =  10.dp,
                        topStart = 10.dp,
                        topEnd = 10.dp
                    )

                ) {
                    Text(
                        text = stringResource(
                            R.string.entre
                        )
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription ="",
                        tint = Color(0xFFFFFFFF)

                    )
                }
                Row (
                    modifier = modifier
                        .align(Alignment.End)
                        .padding(top = 20.dp)
                ){
                    Text(
                        text = stringResource(
                            R.string.nao_conta
                        ),
                        color = Color(0xF06C6C6C)
                    )
                    Text(
                        text =  stringResource(
                            R.string.cria_conta
                        ),
                        color = Color(0xFFDE0FF2),
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
        }
    }
}



@Preview
@Composable
private  fun HomeScreenPreview() {

    HomeScreen()

}

