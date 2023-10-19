package com.blez.LandingPage.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.resize
import com.varabyte.kobweb.compose.css.scale
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

@OptIn(ExperimentalComposeWebApi::class)
val AboutImageStyle by ComponentStyle {
    base {
        Modifier
            .styleModifier {
                filter {
                    grayscale(100.percent)
                }
            }
            .borderRadius(
                r = 0.px
            )
            .rotate(0.deg)
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
    hover {
        Modifier
            .styleModifier {
                filter {
                    grayscale(0.percent)
                }

            }
            .borderRadius(
                r = 0.px
            )
            .rotate(10.deg)

    }
}


@OptIn(ExperimentalComposeWebApi::class)
val ZoomImageStyle by ComponentStyle{
    base {
        Modifier
            .styleModifier {

            }
            .borderRadius(
                r = 0.px
            )
            .rotate(0.deg)
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
    hover{
        Modifier
            .styleModifier {
                filter {
                  scale(1.2)
                }

            }
            .borderRadius(
                r = 0.px
            )

    }
}


val AboutTextStyle by ComponentStyle {
    base {
        Modifier.opacity(50.percent)
            .transition(CSSTransition(property = "opacity", duration = 200.ms))
    }
    hover{
        Modifier.opacity(100.percent)
    }
}
val AboutButtonStyle by ComponentStyle {
    base {
        Modifier.width(80.px)
            .transition(CSSTransition(property = "width", duration = 200.ms))
    }
    hover{
        Modifier.width(110.px)
    }
}