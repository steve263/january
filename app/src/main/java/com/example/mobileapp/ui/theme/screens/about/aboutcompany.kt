package com.example.mobileapp.ui.theme.screens.about


//This is an international company
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mobileapp.R
import com.example.mobileapp.navigation.ROUTE_ABOUT
import com.example.mobileapp.navigation.ROUTE_HOME
import com.example.mobileapp.navigation.ROUTE_REGISTER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {


        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "This is an international company")
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }) {
            Text(text = "HOME")
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}
