package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.styles.LogoStyle
import com.blez.LandingPage.styles.NavigationItemStyle
import com.blez.LandingPage.util.Constants
import com.blez.LandingPage.util.Constants.FONT_FAMILTY

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun Header() {
    val breakpoint by rememberBreakpoint()
    Row(
        modifier = Modifier.fillMaxWidth(if (breakpoint > Breakpoint.MD)80.percent else 90.percent)
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide(breakpoint)
        if (breakpoint > Breakpoint.MD){
            RightSide()
        }

    }
}


@Composable
fun LeftSide(breakpoint: Breakpoint) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        if (breakpoint <= Breakpoint.MD)
        FaBars(
            modifier = Modifier.margin(right = 15.px), size = IconSize.XL
        )
        Image(modifier = LogoStyle.toModifier(),src = Constants.Res.Image.developer_logo, desc = "Logo Image")
    }
}

@Composable
fun RightSide() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .borderRadius(r = 50.px)
            .padding(all = 20.px)
            .backgroundColor(Theme.LighterGray.rgb),
        horizontalArrangement = Arrangement.End
    ) {
        Sections.values().take(6).forEach { section ->
            Link(
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILTY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None),
                path = section.path,
                text = section.title
            )

        }
    }

}