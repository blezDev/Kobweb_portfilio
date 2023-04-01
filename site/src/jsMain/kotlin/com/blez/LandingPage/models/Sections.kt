package com.blez.LandingPage.models

enum class Sections(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "About me",
        subtitle = "Yours Truly",
        path = "#about"
    ),
    Projects(
        id = "projects",
        title = "Projects",
        subtitle = "I'm Good at",
        path = "#projects"
    ),
    Skills(
        id = "skills",
        title = "Skills",
        subtitle = "My Skills",
        path = "#skills"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "Work Experience",
        path = "#experience"
    ),
    Contact(
        id = "contact",
        title = "Contact me",
        subtitle = "Get in Touch",
        path = "#contact"
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subtitle = "Happy Customers",
        path = "#testimonial"
    ),
    Achievements(
        id = "achievements",
        title = "Achievements",
        subtitle = "Personal Achievements",
        path = "#achievements"
    )
}