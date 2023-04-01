package com.blez.LandingPage.pages

import androidx.compose.runtime.*
import com.blez.LandingPage.sections.AboutSection
import com.blez.LandingPage.sections.MainBackground
import com.blez.LandingPage.sections.MainSection
import com.blez.LandingPage.sections.SkillsSection
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        MainSection()
        AboutSection()
        SkillsSection()

    }
}
