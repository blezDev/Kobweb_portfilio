package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SkillBar(
    name: String,
    progressBarHeight: CSSSizeValue<CSSUnit.px> = 5.px,
    percentage: CSSSizeValue<CSSUnit.percent> = 50.percent
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(500.px)
            .padding(topBottom = 5.px)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().margin(bottom = 5.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            P(
                attrs = Modifier
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(name)
            }

            P(
                attrs = Modifier
                    .fontFamily(Constants.FONT_FAMILTY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("${percentage.value}${percentage.unit}")
            }

        }
        Box(modifier = Modifier.fillMaxWidth())
        {
            Box(modifier = Modifier.height(progressBarHeight)
                .fillMaxWidth()
                .backgroundColor(Theme.LightGray.rgb)) {

            }
            Box(modifier = Modifier.height(progressBarHeight)
                .fillMaxWidth(percentage)
                .backgroundColor(Theme.Primary.rgb)) {

            }
        }

    }
}