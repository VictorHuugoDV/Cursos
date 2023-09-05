package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Data

class DataSource {
    fun loandDatas(): List<Data> {
        return listOf<Data>(
            Data(R.drawable.architecture, R.string.architecture, R.string.architecture1),
            Data(R.drawable.crafts, R.string.crafts, R.string.crafts2),
            Data(R.drawable.business, R.string.business, R.string.business3),
            Data(R.drawable.culinary,R.string.culinary,R.string.culinary4),
            Data(R.drawable.design,R.string.design,R.string.design5),
            Data(R.drawable.fashion,R.string.fashion,R.string.fashion6),
            Data(R.drawable.film,R.string.film,R.string.film7),
            Data(R.drawable.gaming,R.string.gaming,R.string.gaming8),
            Data(R.drawable.drawing,R.string.drawing,R.string.gaming8),
            Data(R.drawable.lifestyle,R.string.lifestyle,R.string.lifestyle10),
            Data(R.drawable.music,R.string.music,R.string.music11),
            Data(R.drawable.painting,R.string.painting,R.string.painting12),
            Data(R.drawable.photography,R.string.photography,R.string.photography13),
            Data(R.drawable.tech,R.string.tech,R.string.tech14)
        )
    }
}