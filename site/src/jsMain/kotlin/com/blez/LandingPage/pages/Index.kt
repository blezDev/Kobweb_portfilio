package com.blez.LandingPage.pages

import androidx.compose.runtime.*
import com.blez.LandingPage.components.BackToTopButton
import com.blez.LandingPage.components.OverflowMenu
import com.blez.LandingPage.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Page
@Composable
fun HomePage() {
    var menuOpened by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            MainSection(onMenuClicked = {menuOpened = true})
            AboutSection()
            SkillsSection()
            ProjectSection()
            ExperienceSection()
            BondSection()
            ContactSection()
            FooterSection()

        }
        BackToTopButton()
        if (menuOpened) {
            OverflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
}
