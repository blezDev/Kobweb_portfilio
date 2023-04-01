package com.blez.LandingPage.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skills(val title: String, val percentage: CSSSizeValue<CSSUnit.percent>) {

    Android(
        title = "Android Development",
        percentage = 75.percent
    ),
    Kotlin(
        title = "Kotlin",
        percentage = 70.percent
    ),
    Java(
        title = "Java",
        percentage = 50.percent
    ),
    XML(
        title = "XML",
        percentage = 55.percent
    ),
    C(
        title = "C",
        percentage = 65.percent
    )
}