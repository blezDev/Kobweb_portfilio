package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.models.Experience
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Composable
fun ExperienceCard(
    active: Boolean = false,
    breakpoint: Breakpoint,
    experience: Experience

) {
    SimpleGrid(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(if (breakpoint >= Breakpoint.MD) 60.percent else 90.percent),
        numColumns = numColumns(base = 1, md = 2)
    ) {

        Image(
            src = experience.image, desc = "Experience Image", modifier = Modifier
                .size(300.px)
                .objectFit(ObjectFit.Contain)
        )
        ExperienceDetails(breakpoint, active, experience)


    }

}

@Composable
fun ExperienceDetails(
    breakpoint: Breakpoint,
    active: Boolean,
    experience: Experience
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .margin(left = if (breakpoint >= Breakpoint.MD) 14.px else 0.px),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint >= Breakpoint.MD) {
            ExperienceNumber(active, experience)
        }
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            P(attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(Constants.FONT_FAMILTY)
                .fontSize(20.px)
                .color( Theme.Secondary.rgb)
                .fontWeight(FontWeight.Bold)
                .toAttrs())
            {
                Text(experience.position)
            }
            P(attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(Constants.FONT_FAMILTY)
                .fontSize(16.px)
                .color( Theme.Secondary.rgb)

                .fontWeight(FontWeight.Normal)
                .toAttrs())
            {
                Text("${experience.from} - ${experience.to}")
            }
        }

    }
}

@Composable
fun ExperienceNumber(
    active: Boolean,
    experience: Experience
) {
    Box(
        modifier = Modifier
            .margin(right = 14.px)
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    )
    {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(3.px)
                .backgroundColor(Theme.Primary.rgb)
        )
        Box(
            modifier = Modifier
                .size(40.px)
                .border(
                    width = 3.px,
                    style = LineStyle.Solid,
                    color = Theme.Primary.rgb
                )
                .backgroundColor(if (active) Theme.Primary.rgb else Colors.White)
                .borderRadius(50.percent),
            contentAlignment = Alignment.Center
        ) {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(16.px)
                    .color(if (active) Colors.White else Theme.Primary.rgb)
                    .fontWeight(FontWeight.Bold)
                    .toAttrs()
            ) {
                Text(experience.number)
            }
        }
    }
}

