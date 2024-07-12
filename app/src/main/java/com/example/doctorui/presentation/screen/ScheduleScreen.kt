package com.example.doctorui.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doctorui.presentation.components.ScheduleDoctorCard
import com.example.doctorui.ui.theme.BluePrimary
import com.example.doctorui.ui.theme.poppinsFontFamily

@Composable
fun ScheduleScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        LazyRow(
            modifier = Modifier.padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(3) {
                CategorySchedule()
            }
        }
        LazyColumn(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(5) {
                ScheduleDoctorCard()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategorySchedule(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .wrapContentWidth()
            .padding(top = 20.dp),
        shape = RoundedCornerShape(100.dp),
        color = Color(0xFF63B4FF).copy(alpha = 0.1f),
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Upcoming Schedule",
            color = BluePrimary,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ScheduleScreenPreview() {
    ScheduleScreen()

}