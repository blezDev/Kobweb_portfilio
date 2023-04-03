package com.blez.LandingPage.models

import com.blez.LandingPage.util.Constants

enum class Projects(val title: String,val img: String, val link: String) {

    AniStream(
        "AniStream(Anime Streaming App)",
        Constants.Res.Image.naruto,
        "https://github.com/blezDev/Aniflex_Android_APP"
    ),
    DoodleKong(
        "DoodleKong(Drawing Game)",
        Constants.Res.Image.doodlekong,
        "https://github.com/blezDev/Doodlekong"
    ),
    Avyakt_APP(
        "Avyakt 2.0(TechFest Registration)",
        Constants.Res.Image.avyakt,
        "https://play.google.com/store/apps/details?id=com.gietu2.avyakt2o"
    ),
    BeaconTransmitter(
        "iBeacon Transmitter",
        Constants.Res.Image.iBeacon,
        "https://github.com/blezDev/BeaconTransmitter"
    ),
    ShoppingAPP(
        "E-Shop App",
        Constants.Res.Image.shopping,
        "https://github.com/blezDev/ShoppingApp"
    ),
    Bleach(
        "Bleach FanWiki App",
        Constants.Res.Image.bleach,
        "https://github.com/blezDev/Bleach_FanWiki_App"
    )


}