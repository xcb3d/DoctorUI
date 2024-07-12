package com.example.doctorui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doctorui.R
import com.example.doctorui.ui.theme.poppinsFontFamily


@Composable
fun ScheduleTimeContent(modifier: Modifier = Modifier,color: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Content(icon = R.drawable.ic_bottom_schedule, title = "Sunday, 20 Feb", contentColor = color)
        Content(icon = R.drawable.ic_clock, title = "10:00 - 11:00 PM", contentColor = color)
    }
}


@Composable
fun Content(
    icon : Int,
    title : String,
    contentColor : Color,
    modifier: Modifier = Modifier,

) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "",
            colorFilter = ColorFilter.tint(color = contentColor),
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = title,
            fontFamily = poppinsFontFamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.W400,
            color = contentColor)
    }
}