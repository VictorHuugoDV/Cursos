package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.StringRes

data class Data(
    @DrawableRes val imageCourses:Int,
    @StringRes val stringCourses:Int,
    @StringRes val stringNumber:Int
)
