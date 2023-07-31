package com.company0ne.firstcompose

import android.graphics.ColorFilter
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company0ne.firstcompose.ui.theme.FirstComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Text(text = "Hello User")
            TextInput()
        }
    }
}

//Text Composable
//    @Composable
//    fun Show(name: String){
//        Text(text = "Hello $name")
//    }
//@Preview(showBackground = true, name = "Hello Msg", showSystemUi = true, widthDp = 200, heightDp = 200)
//@Composable
//private fun PreviewFunction(){
//    Show(name = "Anand")
//}


//Image Composable
//@Preview(showBackground = true, showSystemUi = true, widthDp = 500, heightDp = 500)
//@Composable
//private fun PreviewFunction2(){
//    Image(painter = painterResource(id = R.drawable.a),
//        contentDescription ="Openhimer",
//    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Blue),
//        contentScale = ContentScale.Crop
//    )
//
//}

//Button Composable
//@Preview(showSystemUi = true, showBackground = true, widthDp = 200, heightDp = 200)
//@Composable
//private fun PreviewFunction3(){
//    Button(onClick = { /*TODO*/ }) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = R.drawable.b), contentDescription ="Dummy Button" )
//
//    }
//}

//TextField Compose
//@Preview(showBackground = true,  widthDp = 200, heightDp = 200)
//@Composable
//private fun PreviewFunction4(){
//    TextField(value = "Hello ", onValueChange = {},
//    label = { Text(text = "Enter Message")},
//        placeholder = {}
//        )
//}
//@Composable
//fun TextInput(){
//    val state  =remember{ mutableStateOf( " ") }//
//    TextField(value = state.value,
//        onValueChange = {
//     state.value = it
//    },
//        label = { Text(text = "Enter Message")},
//    )
//}

//Arrangement and Alignment
//@Preview(showBackground = true, widthDp = 200, heightDp = 200)
//@Composable
//fun PreviewFunction() {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//}
//@Composable
//fun TextInput(){
//
//    val state = remember {
//        mutableStateOf(" ")}
//    TextField(value = state.value, onValueChange ={
//        state.value = it
//    } )
//}

//Box
//@Preview(showBackground = true, widthDp = 300, heightDp = 300)
//@Composable
//private fun PreviewFunction(){
//    Box(contentAlignment = Alignment.Center){
////        Text(text = "A", fontSize = 24.sp)
////        Text(text = "B", fontSize = 24.sp)
//        //similarly we can do with images , overlap each others
//      Image(painter = painterResource(id = R.drawable.b), contentDescription = "Image a")
//        Image(painter = painterResource(id = R.drawable.arrow), contentDescription ="Image arrow" )
//    }
//}
//
//@Composable
//fun TextInput(){
//    val state = remember {
//            mutableStateOf(" ")}
//        TextField(value = state.value, onValueChange ={
//            state.value =it
//        } )
//}

//Now we all these three things

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun PreviewFunction() {
    Column() {
        ListViewItem(R.drawable.user_icon,"Anand", "Android Developer")
        ListViewItem(imgId = R.drawable.baseline_account_circle_24, name = "User 1", occupation ="Software Developer" )
        ListViewItem(imgId = R.drawable.baseline_supervised_user_circle_24, name ="User 2" , occupation ="Junior Developer")
    }
   }

@Composable
fun ListViewItem(imgId: Int,name : String,occupation : String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "User Icon",
            Modifier.size(40.dp)
        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Light
            )

        }

    }
}

@Composable
fun TextInput() {
    val state = remember {
        mutableStateOf(" ")
    }
    TextField(value = state.value, onValueChange = {
        state.value = it
    })
}


