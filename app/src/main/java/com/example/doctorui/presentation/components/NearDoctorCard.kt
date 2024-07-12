package com.example.doctorui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.example.doctorui.ui.theme.BluePrimary
import com.example.doctorui.ui.theme.Orange
import com.example.doctorui.ui.theme.PurpleGrey
import com.example.doctorui.ui.theme.TextColorTitle
import com.example.doctorui.ui.theme.poppinsFontFamily

@Composable
fun NearDoctorCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        tonalElevation = 0.5.dp,
        shadowElevation = 0.2.dp
    ) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Image(
                    modifier = Modifier.size(48.dp),
                    painter = painterResource(id = R.drawable.img_doctor_1),
                    contentDescription = ""
                )
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Dr. Ahama",
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFontFamily,
                        color = TextColorTitle
                    )
                    Text(
                        text = "General Doctor",
                        fontWeight = FontWeight.Light,
                        fontFamily = poppinsFontFamily,
                        color = PurpleGrey
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.size(15.dp),
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(
                            PurpleGrey
                        )
                    )
                    Text(
                        text = "1.2km",
                        fontFamily = poppinsFontFamily,
                        color = PurpleGrey,
                        fontWeight = FontWeight.Light
                    )
                }
            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(1.dp)
                    .alpha(0.2f),
                color = PurpleGrey
            )
            Row(
            ) {
                BottomItem(
                    color = Orange,
                    icon = R.drawable.ic_review,
                    title = "4.5 (Reviews)"
                )
                BottomItem(
                    color = BluePrimary,
                    icon = R.drawable.ic_clock,
                    title = "Open at 17:00"
                )
            }
        }
    }
}

@Composable
private fun BottomItem(
    color: Color,
    icon: Int,
    title: String,
) {
    Row(
        modifier = Modifier
//            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(color = color)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = title,
            fontWeight = FontWeight.W400,
            fontSize = 16.sp,
            fontFamily = poppinsFontFamily,
            color = color
        )
    }
}

@Preview
@Composable
private fun NearDoctorCardPreview() {
    NearDoctorCard()
}