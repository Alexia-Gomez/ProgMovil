package com.alexiagomez.login.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alexiagomez.login.R

@Composable
fun WelcomeScreen(navController: NavController) {
    val primaryBlue = Color(0xFF42429E)
    val textGray = Color(0xFF757575)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 60.dp, horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.main_img),
            contentDescription = "main image",
            modifier = Modifier
                .size(300.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF2D2D2D)
            )

            Box(modifier = Modifier.height(5.dp))

            Text(
                text = "Welcome To Little Drop, where\nyou manage you daily tasks",
                fontSize = 14.sp,
                color = textGray,
                textAlign = TextAlign.Center
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = {
                    navController.navigate("login")
                },
                modifier = Modifier
                    .height(45.dp)
                    .width(240.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(81,78,184)
                ),
            ) {
                Text(
                    text = "Login",
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }

            Box(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    navController.navigate("register")
                },
                modifier = Modifier
                    .height(45.dp)
                    .width(240.dp),
                border = BorderStroke(1.5.dp, primaryBlue),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 14.sp,
                    color = Color(81,78,184),
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Sign up using", fontSize = 12.sp, color = textGray)
            Row(
                modifier = Modifier.padding(top = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(30.dp)
                        .background(Color(0xFF3B5998), CircleShape)
                ) {
                    Text("f", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(30.dp)
                        .background(Color(0xFFDB4437), CircleShape)
                ) {
                    Text("G+", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(30.dp)
                        .background(Color(0xFF007BB5), CircleShape)
                ) {
                    Text("in", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

            }
            Box(modifier = Modifier.height(50.dp))
        }
    }
}