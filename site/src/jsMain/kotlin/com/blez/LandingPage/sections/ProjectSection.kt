package com.blez.LandingPage.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.blez.LandingPage.components.ProjectCard
import com.blez.LandingPage.components.SectionTitle
import com.blez.LandingPage.models.Projects
import com.blez.LandingPage.models.Sections
import com.blez.LandingPage.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button

@Composable
fun ProjectSection() {

    Box(
        modifier = Modifier
            .id(Sections.Projects.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {

    ProjectContent()
    }
}

@Composable
fun ProjectContent(){
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent)
            .maxWidth(1200.px), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            sections = Sections.Projects,
            alignment = Alignment.CenterHorizontally,
            modifier = Modifier.margin(bottom = 10.px)
        )
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 80.percent),
            numColumns = numColumns(base = 1, md = 3)
        ) {
        Projects.values().forEach {project->
            ProjectCard(projects = project)

        }

        }



        }
    }
