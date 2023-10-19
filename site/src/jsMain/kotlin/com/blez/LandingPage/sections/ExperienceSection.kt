package com.blez.LandingPage.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.components.ExperienceCard
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.models.Experience
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ExperienceSection() {
    Box(
        modifier = Modifier
            .id(Sections.Experience.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {
        ExperienceContent()

    }
}

@Composable
fun ExperienceContent() {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier

            .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
            .maxWidth(1200.px), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            sections = Sections.Experience,
            alignment = Alignment.CenterHorizontally,
            modifier = Modifier.margin(bottom = 25.px)
        )
        Experience.values().forEach {experience->
            ExperienceCard(
                breakpoint = breakpoint,
                experience = experience,
                active = experience.name == Experience.BlankCanvas.name

            )

        }

    }

}


