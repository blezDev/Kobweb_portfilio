package com.blez.LandingPage.components

import androidx.compose.runtime.Composable
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Theme
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
   modifier: Modifier = Modifier,
   sections: Sections,
   alignment: Alignment.Horizontal = Alignment.Start
){
Column(modifier = modifier, horizontalAlignment = alignment) {
   P(
      attrs = Modifier
         .fillMaxWidth()
         .textAlign(if(alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start)
         .margin(topBottom = 0.px)
         .fontFamily(Constants.FONT_FAMILTY)
         .fontSize(25.px)
         .fontWeight(FontWeight.Normal)
         .color(Theme.Primary.rgb)
         .toAttrs()
   ) {
      Text(sections.title)
   }
   P(
      attrs = Modifier
         .fillMaxWidth()
         .textAlign(if(alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start)
         .margin(bottom = 10.px, top = 0.px)
         .fontFamily(Constants.FONT_FAMILTY)
         .fontSize(40.px)
         .fontWeight(FontWeight.Bold)
         .color(Theme.Secondary.rgb)
         .toAttrs()
   ) {
      Text(sections.subtitle)
   }
   Box(modifier = Modifier
      .height(2.px)
      .width(80.px)
      .backgroundColor(Theme.Primary.rgb)
      .borderRadius(r = 50.px)) {

   }
}
}