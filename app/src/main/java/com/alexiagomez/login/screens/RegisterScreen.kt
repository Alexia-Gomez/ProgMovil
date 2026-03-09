package com.alexiagomez.login.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 50.dp, vertical = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.login_img),
                contentDescription = "main image",
                modifier = Modifier
                    .size(250.dp)
            )
        }
        Text(
            text = "Register",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 15.dp),
            textAlign = TextAlign.Center
        )

        Text(text = "Name", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        Box(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 16.dp)
                .fillMaxWidth()
                .height(45.dp)
                .border(2.dp, Color.LightGray, RoundedCornerShape(12.dp))
        )

        Text(text = "Email", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        Box(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 16.dp)
                .fillMaxWidth()
                .height(45.dp)
                .border(2.dp, Color.LightGray, RoundedCornerShape(12.dp))
        )

        Text(text = "Phone number", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        Box(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 16.dp)
                .fillMaxWidth()
                .height(45.dp)
                .border(2.dp, Color.LightGray, RoundedCornerShape(12.dp))
        )

        Text(text = "Password", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        Box(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 16.dp)
                .fillMaxWidth()
                .height(45.dp)
                .border(2.dp, Color.LightGray, RoundedCornerShape(12.dp))
        )

        Text(text = "Confirm password", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        Box(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 16.dp)
                .fillMaxWidth()
                .height(45.dp)
                .border(2.dp, Color.LightGray, RoundedCornerShape(12.dp))
        )

        Box(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(130.dp)
                    .height(45.dp)
                    .background(Color(0xFF5A52A5), RoundedCornerShape(50))

            ) {
                Text("Sign Up", color = Color.White, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}