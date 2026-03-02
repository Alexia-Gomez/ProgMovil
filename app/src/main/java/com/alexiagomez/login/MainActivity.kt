package com.alexiagomez.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginView()
        }
    }
}

@Composable
fun LoginView() {
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
            painter = painterResource(id = R.drawable.login_img),
            contentDescription = "login image",
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
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(240.dp)
                    .height(45.dp)
                    .background(primaryBlue, RoundedCornerShape(50))
            ) {
                Text("Login", color = Color.White, fontWeight = FontWeight.Bold)
            }

            Box(modifier = Modifier.height(20.dp))

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(240.dp)
                    .height(45.dp)
                    .border(1.5.dp, primaryBlue, RoundedCornerShape(50))
            ) {
                Text("Sign Up", color = primaryBlue, fontWeight = FontWeight.Bold)
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