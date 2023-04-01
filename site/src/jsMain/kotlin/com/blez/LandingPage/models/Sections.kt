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
        title = "About",
        subtitle = "Yours Truly",
        path = "#about"
    ),
    Skills(
        id = "skills",
        title = "Skills",
        subtitle = "I'm Good at",
        path = "#skills"
    ),
    Projects(
        id = "projects",
        title = "Projects",
        subtitle = "I'm Have Worked at",
        path = "#projects"
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