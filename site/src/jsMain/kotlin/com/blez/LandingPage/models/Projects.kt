package com.blez.LandingPage.models

import com.blez.LandingPage.util.Constants

enum class Projects(val title: String,val img: String, val link: String) {

    GietuOfficial(
        "GIETU OFFICIAL",
        Constants.Res.Image.gietu,
        "https://play.google.com/store/apps/details?id=com.gietuofficialapp.gietuofficial"
    ),
    AniStream(
        "AniStream(Anime Streaming App)",
        Constants.Res.Image.anistream,
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
    Bleach(
        "Bleach FanWiki App",
        Constants.Res.Image.bleach,
        "https://github.com/blezDev/Bleach_FanWiki_App"
    ),
    Shopping(
        "E-Shop APP",
        Constants.Res.Image.shopping,
        "https://github.com/blezDev/ShoppingApp"
    ),
    Heart(
        "Heart Disease App",
        Constants.Res.Image.heart
        ,"https://github.com/blezDev/Heart_Care_Android_app"
    ),
    Meme(
        "Random Meme APP",
        Constants.Res.Image.meme,
        "https://github.com/blezDev/MemeLord_Meme_Viewer"
    )


}