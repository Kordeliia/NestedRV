package com.example.myapplication

object FakeDB {
    fun getAllMusic(): List<MusicGroup>{
        val songList = listOf(
            Song("Nanai", R.color.purple_800),
            Song("Iuiu", R.color.red_800),
            Song("Party!", R.color.green_800),
            Song("No se ve", R.color.light_blue_800),
            Song("Waka", R.color.pink_800),
            Song("TQG", R.color.deep_purple_800),
            Song("Sesion53", R.color.blue_800),
            Song("Luv", R.color.cyan_800)
        )
        val musicGroupList = listOf(
            MusicGroup("Sigue escuchando...", songList),
            MusicGroup("Descubre...", songList),
            MusicGroup("Lista de fiesta", songList),
            MusicGroup("Mientras estudias", songList),
            MusicGroup("Suspense", songList),
            MusicGroup("Top 90", songList),
            MusicGroup("Lo mas escuchado", songList)
        )
        return musicGroupList
    }
}