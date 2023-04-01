package com.blez.LandingPage.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.components.Header
import com.blez.LandingPage.components.SocialBar
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.styles.MainButtonStyle
import com.blez.LandingPage.styles.MainImageStyle
import com.blez.LandingPage.util.Constants.FONT_FAMILTY
import com.blez.LandingPage.util.Constants.INTO_TEXT

import com.blez.LandingPage.util.Constants.SECTION_WIDTH
import com.blez.LandingPage.util.Constants.Res
import com.varabyte.kobweb.compose.css.*
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
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection() {

    Box(modifier = Modifier.maxWidth(SECTION_WIDTH.px), contentAlignment = Alignment.TopCenter) {
        MainBackground()
        MainContent()

    }
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover), src = Res.Image.background,
        desc = "Background Image"
    )
}

@Composable
fun MainContent() {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent
                ), numColumns = numColumns(base = 1, md = 2)
            ) {
                MainText(breakpoint)

            }
        }


    }
}

@Composable
fun MainText(breakpoint: Breakpoint) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        if (breakpoint > Breakpoint.MD) {
            SocialBar()
        }
        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILTY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 45.px else 25.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text("Hello, I'm")
            }
            P(
                attrs = Modifier
                    .margin(top = 20.px)
                    .fontFamily(FONT_FAMILTY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 50.px else 30.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("M Saikrishna Pattnaik")
            }
            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILTY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("Mobile Developer")
            }
            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .fontFamily(FONT_FAMILTY)
                    .fontSize(17.px)
                    .maxWidth(400.px)
                    .textAlign(TextAlign.Justify)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(INTO_TEXT)
            }
            Button(
                attrs = MainButtonStyle.toModifier()
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .padding(all = 10.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier
                        .color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "Connect With Me",
                    path = Sections.Contact.path
                )
            }
        }
    }

}

@Composable
fun MainImage() {
    Image(modifier = MainImageStyle.toModifier().fillMaxSize(80.percent), src = "", desc = "Main Image")
}