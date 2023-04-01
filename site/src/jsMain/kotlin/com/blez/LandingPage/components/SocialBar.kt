package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.styles.SocialLinkStyle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar() {
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
        SocialLinks()
    }

}

@Composable
private fun SocialLinks() {
    Link(path = "https://github.com/blezDev") {
        FaGithub(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(path = "https://www.linkedin.com/in/m-saikrishna-pattnaik-261013211/") {
        FaLinkedinIn(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(path = "https://twitter.com/MSaikrishnaPat5") {
        FaTwitter(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(path = "https://instagram.com/kaiju837?igshid=ZDdkNTZiNTM=") {
        FaInstagram(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
}