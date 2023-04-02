package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.styles.SocialLinkStyle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(
    row: Boolean = false
) {


    if (row) {
        Row(
            modifier = Modifier
                .margin(top = 25.px)
                .padding(leftRight = 25.px)
                .minHeight(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            SocialLinks(row)
        }
    } else {
        Column(
            modifier = Modifier
                .padding(topBottom = 25.px, leftRight = 5.px)
                .minWidth(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White)
                .margin(right = 25.px),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SocialLinks(row)
        }
    }

}

@Composable
private fun SocialLinks(row: Boolean = false) {
    Link(path = "https://github.com/blezDev") {
        FaGithub(
            modifier = SocialLinkStyle.toModifier().margin(
                bottom = if (row) 0.px else 40.px,
                right = if (row) 40.px else 0.px
            ),
            size = IconSize.LG
        )
    }
    Link(path = "https://www.linkedin.com/in/m-saikrishna-pattnaik-261013211/") {
        FaLinkedinIn(
            modifier = SocialLinkStyle.toModifier().margin(
                bottom = if (row) 0.px else 40.px,
                right = if (row) 40.px else 0.px
            ),
            size = IconSize.LG
        )
    }
    Link(path = "https://twitter.com/MSaikrishnaPat5") {
        FaTwitter(
            modifier = SocialLinkStyle.toModifier().margin(
                bottom = if (row) 0.px else 40.px,
                right = if (row) 40.px else 0.px
            ),
            size = IconSize.LG
        )
    }
    Link(path = "https://instagram.com/kaiju837?igshid=ZDdkNTZiNTM=") {
        FaInstagram(
            modifier = SocialLinkStyle.toModifier().margin(
                bottom = if (row) 0.px else 40.px,
                right = if (row) 40.px else 0.px
            ),
            size = IconSize.LG
        )
    }
}

