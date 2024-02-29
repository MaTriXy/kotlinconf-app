package org.jetbrains.kotlinconf.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import kotlinconfapp.shared.generated.resources.Res
import kotlinconfapp.shared.generated.resources.schedule_day_1_banner
import kotlinconfapp.shared.generated.resources.schedule_day_2_banner
import kotlinconfapp.shared.generated.resources.schedule_day_3_banner
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.kotlinconf.ui.theme.agendaHeaderColor
import org.jetbrains.kotlinconf.ui.painter


@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun AgendaDayHeader(title: String) {
    val image = when (title) {
        "APRIL 12" -> Res.drawable.schedule_day_1_banner
        "APRIL 13" -> Res.drawable.schedule_day_2_banner
        else -> Res.drawable.schedule_day_3_banner
    }

    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.agendaHeaderColor)
            .fillMaxWidth()
            .padding(top = 4.dp)
    ) {
        Image(
            image.painter(),
            contentDescription = null,
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.None
        )
    }
}
