package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.models.Projects
import com.blez.LandingPage.styles.ProjectSectionStyle
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.*
import com.varabyte.kobweb.compose.ui.graphics.Color.*
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCard(
    modifier: Modifier = Modifier,
    projects: Projects
) {
    Link(
        modifier = ProjectSectionStyle.toModifier().textDecorationLine(TextDecorationLine.None),
        path = projects.link,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        Column(modifier = modifier.id("columnParent").padding(all = 15.px)) {
            Box(
                modifier = Modifier
                    .id("boxParent")
                    .fillMaxWidth()
                    .maxWidth(350.px)
                    .margin(bottom = 20.px)
            ) {
                Image(
                    src = projects.img, desc = "Project Image", modifier = Modifier
                        .size(300.px)
                        .objectFit(ObjectFit.Cover)
                )
                Box(
                    modifier = Modifier
                        .id("greenOverlay")
                        .fillMaxHeight()
                        .backgroundColor(argb(a = 0.5f, r = 0, g = 167, b = 142)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier.id("linkIcon")
                            .size(32.px),
                        src = Constants.Res.Icon.link,
                        desc = "Link Icon"
                    )
                }
            }
            P(
                attrs = Modifier
                    .id("portfolioTitle")
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(18.px)

                    .textAlign(TextAlign.Center)
                    .fontWeight(FontWeight.Bold)

                    .toAttrs()
            ) {
                Text(projects.title)
            }
        }
    }

}