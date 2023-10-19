package com.blez.LandingPage.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.styles.AboutImageStyle
import com.blez.LandingPage.styles.ZoomImageStyle
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.functions.RadialGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.w3c.dom.ImageOrientation

@Composable
fun BondSection(){
    Box(
        modifier = Modifier
            .id(Sections.Bond.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ){
    BondContent()
    }
}

@Composable
fun BondContent(){
    val breakpoint by rememberBreakpoint()


    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            SectionTitle(
                sections = Sections.Bond,
                alignment = Alignment.CenterHorizontally,
                modifier = Modifier.margin(bottom = 50.px)
            )
        }
/*        Column(
            modifier = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
                .maxWidth(1200.px), horizontalAlignment = Alignment.CenterHorizontally
        ) {*//*
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 80.percent),
                numColumns = numColumns(base = 1, md = 2)
            ){
                if (breakpoint >= Breakpoint.MD) {
                    GroupImage(Orientation.HORIZONTAL)
                }else{
                    GroupImage(Orientation.VERTICAL)
                }
            }*//*

        }*/
        if (breakpoint >= Breakpoint.MD) {
            GroupImage(Orientation.HORIZONTAL)
        }else{
            GroupImage(Orientation.VERTICAL)

        }
    }
}

@Composable
fun GroupImage(orientation : Orientation){
    Box(  modifier = Modifier
        .fillMaxWidth() .maxWidth(1200.px)) {
        if (orientation ==Orientation.HORIZONTAL){
         Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
             Image(
                 modifier = ZoomImageStyle.toModifier().size(60.percent).height(65.percent),
                 src = Constants.Res.Image.pic2, desc = "Profile Photo"
             )

             Image(
                 modifier = ZoomImageStyle.toModifier().size(35.percent),
                 src = Constants.Res.Image.pic1, desc = "Profile Photo"
             )
         }
        }else{
            Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {

                Image(
                    modifier = ZoomImageStyle.toModifier().size(25.percent),
                    src = Constants.Res.Image.pic2, desc = "Profile Photo"
                )
                Image(
                    modifier = ZoomImageStyle.toModifier().size(25.percent),
                    src = Constants.Res.Image.about_image, desc = "Profile Photo"
                )
                Image(
                    modifier = ZoomImageStyle.toModifier().size(25.percent),
                    src = Constants.Res.Image.pic1, desc = "Profile Photo"
                )
            }
        }
    }
}
enum class Orientation{
    HORIZONTAL,
    VERTICAL
}
