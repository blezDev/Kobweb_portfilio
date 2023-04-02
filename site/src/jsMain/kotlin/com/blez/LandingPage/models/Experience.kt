package com.blez.LandingPage.models

import com.blez.LandingPage.util.Constants

enum class Experience(
    val number: String,
    val position: String,
    val from: String,
    val to : String,
    val image : String

) {
    Verzeo(
        "01",
        "Intern at Verzeo edutech as Android Develop(Java)",
        "May 2021",
        "June 2021",
        Constants.Res.Image.verzeo
    ),
    SmartBridge(
        "02",
        "Completed Google Supported Virtual Internship Program as Android Develop(Kotlin)",
        "August 2022",
        "September 2022",
        Constants.Res.Image.smart_internz
    ),
    Android_Lead(
        "03",
        "Android Lead at Google Developer Student Club GIETU",
        "August 2022",
        "Present",
        Constants.Res.Image.google_club
    )


}