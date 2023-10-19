package com.blez.LandingPage.sections

import androidx.compose.runtime.*
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.styles.AboutButtonStyle
import com.blez.LandingPage.styles.AboutImageStyle
import com.blez.LandingPage.styles.AboutTextStyle
import com.blez.LandingPage.styles.MainButtonStyle
import com.blez.LandingPage.util.Constants
import com.blez.LandingPage.util.ObserveViewportEntered
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.FaGoogle
import com.varabyte.kobweb.silk.components.icons.fa.FaPerson
import com.varabyte.kobweb.silk.components.icons.fa.FaUser
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {

    Box(
        modifier = Modifier
            .id(Sections.About.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {
        AboutContent()

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
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 80.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            if (breakpoint >= Breakpoint.MD) {
                AboutImage()
            }
            AboutMe()

        }

    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun AboutImage() {
    Box {
        Image(
            modifier = AboutImageStyle.toModifier().fillMaxWidth(80.percent),
            src = Constants.Res.Image.about_image, desc = "Profile Photo"
        )
    }
}

@Composable
fun AboutMe() {


    Column(
        modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(
            sections = Sections.About,
            alignment = Alignment.CenterHorizontally,
            modifier = Modifier.margin(bottom = 10.px)
        )
        Column(modifier = Modifier) {
            P(
                attrs = Modifier

                    .margin(topBottom = 5.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(21.px)

                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)

                    .toAttrs()
            ) {

                    Text(" Hi,\uD83D\uDC4B I am M Saikrishna Pattnaik 21 Years Old from Jeypore, Odisha")
            }
            P(
                attrs = Modifier

                    .margin(topBottom = 5.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(21.px)

                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)

                    .toAttrs()
            ) {

                Text("\uD83D\uDC9E\uFE0FAspiring Android Developer and a opensource enthusiast")
            }
            P(
                attrs = Modifier

                    .margin(topBottom = 5.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(21.px)

                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)

                    .toAttrs()
            ) {
                FaGoogle()
                Text(" Your average Android Lead at GDSC GIETU")
            }
            P(
                attrs = Modifier

                    .margin(topBottom = 5.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(21.px)

                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {

                Text("\uD83C\uDF93 Currently pursuing CSE at GIET University, Gunupur, Odisha, India")
            }

            P(
                attrs = Modifier

                    .margin(topBottom = 5.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(21.px)

                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .fontStyle(FontStyle.Italic)
                    //.color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {

                Text(" \uD83D\uDC40 I’m interested in coding, building cool projects, gaming and reading")
            }
        }
        Box(contentAlignment = Alignment.BottomStart, modifier = Modifier.fillMaxWidth().margin(top = 25.px)){

            Button(
                attrs = AboutButtonStyle.toModifier()
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
                    text = "Resume",
                    path = "https://media.licdn.com/dms/document/media/D561FAQGTjx04KDH0fg/feedshare-document-pdf-analyzed/0/1696504657870?e=1698883200&v=beta&t=GbA3nBxIcnCKrFxm_bkVCWNKzj8OMxFrKJmqBBmQGGI"
                )
            }
        }

    }

}

