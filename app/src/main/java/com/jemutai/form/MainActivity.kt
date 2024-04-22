package com.jemutai.form

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jemutai.form.ui.theme.FormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormTheme {
                AddRefugee()

            }
        }
    }
}


@Composable
fun  AddRefugee() {

    var firstname by remember { mutableStateOf("") }
    var middlename by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var nationalid by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    var nationality by remember { mutableStateOf("") }


    Surface(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Beneficiary Personal Details",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            OutlinedTextField(
                value = firstname,
                onValueChange = { firstname = it },
                label = { Text("First Name") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)
            )
            OutlinedTextField(
                value = middlename,
                onValueChange = { middlename = it },
                label = { Text("Middle Name") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )
            OutlinedTextField(
                value = surname,
                onValueChange = { surname = it },
                label = { Text("Sir Name") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )
            OutlinedTextField(
                value = nationalid,
                onValueChange = { nationalid = it },
                label = { Text("National Identification Number") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )
            OutlinedTextField(
                value = gender,
                onValueChange = { gender = it },
                label = { Text("Gender") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )
            OutlinedTextField(
                value = phonenumber,
                onValueChange = { phonenumber = it },
                label = { Text("Phone Number") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )
            OutlinedTextField(
                value = nationality,
                onValueChange = { nationality = it },
                label = { Text("Nationality") },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(20.dp)

            )


            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
              // colors = ButtonColors = buttonColors(Color.Red)

            ) {
Text(text = "Save/Next")
            }

        }

    }
}



//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    FormTheme {
//        Greeting("Android")
//    }
//}