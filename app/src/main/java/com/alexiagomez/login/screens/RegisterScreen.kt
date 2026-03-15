package com.alexiagomez.login.screens

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alexiagomez.login.R

fun isValidName(name: String): Boolean = name.matches(Regex("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"))
fun isValidEmail(email: String): Boolean = Patterns.EMAIL_ADDRESS.matcher(email).matches()
fun isValidPhone(phone: String): Boolean = phone.matches(Regex("^[0-9]{10}$"))

@Composable
fun RegisterScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    var isNameError by remember { mutableStateOf(false) }
    var isEmailError by remember { mutableStateOf(false) }
    var isPhoneError by remember { mutableStateOf(false) }
    val passwordsMatch = password == confirmPassword && password.isNotEmpty()
    val isFormValid = !isNameError && !isEmailError && !isPhoneError && passwordsMatch && name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 50.dp, vertical = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
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
        OutlinedTextField(
            value = name,
            onValueChange = {
                name = it
                isNameError = !isValidName(it) && it.isNotEmpty()
            },
            isError = isNameError,
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF5A52A5),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            )
        )
        if (isNameError) {
            Text("Solo letras y espacios", color = Color.Red, fontSize = 12.sp, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp))
        }

        Text(text = "Email", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
                isEmailError = !isValidEmail(it) && it.isNotEmpty()
            },
            isError = isEmailError,
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF5A52A5),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            )
        )
        if (isEmailError) {
            Text("Correo invalido", color = Color.Red, fontSize = 12.sp, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp))
        }

        Text(text = "Phone number", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        OutlinedTextField(
            value = phone,
            onValueChange = {
                if(it.length <=10) {
                    phone = it
                    isPhoneError = !isValidPhone(it) && it.isNotEmpty()
                }
            },
            isError = isPhoneError,
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF5A52A5),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            )
        )
        if (isPhoneError) {
            Text("Ingresar 10 digitos sin espacios", color = Color.Red, fontSize = 12.sp, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp))
        }

        Text(text = "Password", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF5A52A5),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            )
        )

        Text(text = "Confirm password", fontSize = 14.sp, modifier = Modifier.fillMaxWidth())
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = {
                confirmPassword = it
            },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF5A52A5),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            )
        )
        if (!passwordsMatch && confirmPassword.isNotEmpty()){
            Text("Las contraseñas no coinciden", color = Color.Red, fontSize = 12.sp, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp))
        }

        Box(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {},
                enabled = isFormValid,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .height(60.dp)
                    .width(100.dp)
                    .padding(top = 5.dp, bottom = 10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5A52A5),
                    disabledContainerColor = Color.LightGray
                )
            ) {
                Text("Sign Up", color = Color.White, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}