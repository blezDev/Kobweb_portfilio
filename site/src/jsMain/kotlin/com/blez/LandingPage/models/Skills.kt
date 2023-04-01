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
    Problem_Solving(
        title = "Problem Solving",
        percentage = 90.percent
    ),
    Willingness_to_Learn_New_Skills_and_Improve(
        title = "Willingness to Learn New Skills and Improve",
        percentage = 100.percent
    )
}