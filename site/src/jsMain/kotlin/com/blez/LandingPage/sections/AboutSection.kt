package com.blez.LandingPage.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.styles.AboutImageStyle
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {

    Box(
        modifier = Modifier
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {


    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun AboutContent() {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
            .maxWidth(1200.px), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleGrid(numColumns = numColumns(base = 1, md = 2)) {
        AboutImage()

        }

    }
}

@ExperimentalComposeWebApi
@Composable
fun AboutImage() {
    Box {
        Image(
            modifier = AboutImageStyle.toModifier().fillMaxWidth(80.percent),
            src = "", desc = "Profile Photo"
        )
    }
}

@Composable
fun AboutMe(){
    Column(modifier = Modifier.fillMaxWidth()
    , verticalArrangement = Arrangement.Center) {
        SectionTitle(sections = Sections.About, alignment = Alignment.CenterHorizontally)
        P(
            attrs = Modifier
                .margin(topBottom = 25.px)
                .fontFamily(Constants.FONT_FAMILTY)
                .fontSize(18.px)
                .maxWidth(500.px)
                .fontWeight(FontWeight.Bold)
                .fontStyle(FontStyle.Italic)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("Mobile Developer")
        }
    }
}
