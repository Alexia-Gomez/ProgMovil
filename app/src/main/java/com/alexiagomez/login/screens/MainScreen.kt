package com.alexiagomez.login.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alexiagomez.login.components.Contact

@Composable
fun MainScreen(navController: NavController){
    val contacts = listOf(Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"), Pair("Juan perez", "612-123-4567"))
    val contactList = remember { mutableStateListOf<Pair<String, String>>() }

    LazyColumn {
        items(contacts){
            contact ->
            Contact(name = contact.first, contact.second)

            //contactList.add(Pair(name, phone))
        }
    }
}

@Composable
fun MainScreenPreview(){
    val navController = rememberNavController()
    MainScreen(navController)
}