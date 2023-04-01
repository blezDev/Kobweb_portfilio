package com.blez.LandingPage.sections

import androidx.compose.runtime.*
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.components.SkillBar
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.models.Skills
import com.blez.LandingPage.util.Constants
import com.blez.LandingPage.util.ObserveViewportEntered
import com.blez.LandingPage.util.animateNumbers
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun SkillsSection(){
    Box(
        modifier = Modifier
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 120.px),
        contentAlignment = Alignment.Center
    ) {
        SkillsContent()

    }
}

@Composable
fun SkillsContent() {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
            .maxWidth(1200.px), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            sections = Sections.Skills,
            alignment = Alignment.CenterHorizontally,
            modifier = Modifier.margin(bottom = 60.px)
        )
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 80.percent).scale(130.percent).margin(top =20.px),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            Skills()
            if (breakpoint >= Breakpoint.MD) {

              SkillsImage()
            }



        }

    }
}

@Composable
fun Skills(){
    val scope = rememberCoroutineScope()
    var viewportEntered by remember { mutableStateOf(false) }
    val animatedPercentage = remember { mutableStateListOf(0,0,0,0,0)}
    ObserveViewportEntered(sectionId = Sections.Skills.id,
        distanceFromTop = 300.0,
        onViewportEntered = {
            viewportEntered = true
            Skills.values().forEach { skill->
                scope.launch {
                    animateNumbers(
                        number = skill.percentage.value.toInt(),
                        onUpdate = {
                            animatedPercentage[skill.ordinal] = it
                        }
                    )
                }

            }
        })
    Column(
        modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start
    ) {
       Skills.values().forEach { skill ->
           SkillBar(title = skill.title, index = skill.ordinal, textFontSize = 15.px,
               percentage = if (viewportEntered) skill.percentage else skill.percentage,  animatedPercentage = if (viewportEntered) animatedPercentage[skill.ordinal] else skill.percentage.value.toInt()   )

       }



    }



}


@Composable
fun SkillsImage() {
    Box {
        Image(
            modifier = Modifier.fillMaxWidth(80.percent).scale(132.percent).margin(left = 60.px).padding(left = 50.px),
            src = Constants.Res.Image.android_image, desc = "Profile Photo"
        )
    }
}
