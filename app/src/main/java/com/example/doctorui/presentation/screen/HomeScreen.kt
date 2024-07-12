package com.example.doctorui.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doctorui.R
import com.example.doctorui.presentation.components.MenuHome
import com.example.doctorui.presentation.components.NearDoctorCard
import com.example.doctorui.presentation.components.ScheduleTimeContent
import com.example.doctorui.ui.theme.BluePrimary
import com.example.doctorui.ui.theme.GraySecond
import com.example.doctorui.ui.theme.PurpleGrey
import com.example.doctorui.ui.theme.WhiteBackground
import com.example.doctorui.ui.theme.poppinsFontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.padding(
            top = 42.dp,
            start = 16.dp,
            end = 16.dp
        )
    ) {
        Column {
            HeaderContent()
            Spacer(modifier = Modifier.height(4.dp))
            ScheduleContent()
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Search doctor or health issue")
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = ""
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = WhiteBackground,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(12.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MenuHome(icon = R.drawable.ic_covid, title = "Covid")
                MenuHome(icon = R.drawable.ic_doctor, title = "Doctor")
                MenuHome(icon = R.drawable.ic_medicine, title = "Medicine")
                MenuHome(icon = R.drawable.ic_hospital, title = "Hospital")
            }
            Text(
                text = "Near Doctor",
                modifier = Modifier.padding(top = 32.dp),
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            LazyColumn(
                modifier = Modifier.padding(top = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(16.dp)
            ){
                items(3) {
                    NearDoctorCard()
                }
            }
        }
    }
}

@Composable
fun ScheduleContent() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = BluePrimary,
        tonalElevation = 1.dp,
        shadowElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(
                vertical = 16.dp,
                horizontal = 20.dp
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    modifier = Modifier.size(48.dp),
                    painter = painterResource(id = R.drawable.img_doctor_1),
                    contentDescription = "",
                )
                Column {
                    Text(
                        text = "Dr. Ibuna Sina",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFontFamily
                    )
                    Text(
                        text = "General Doctor",
                        color = GraySecond,
                        fontWeight = FontWeight.Light,
                        fontFamily = poppinsFontFamily
                    )
                }
                Image(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(color = Color.White)
                )

            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(1.dp)
                    .alpha(0.2f),
                color = Color.White
            )
            ScheduleTimeContent(color = Color.White)

        }

    }

}

@Composable
private fun HeaderContent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Hello",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.W400,
                color = PurpleGrey
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Hi, ABC",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
        }
        Image(
            modifier = Modifier.size(56.dp),
            painter = painterResource(id = R.drawable.img_header_content),
            contentDescription = ""
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}