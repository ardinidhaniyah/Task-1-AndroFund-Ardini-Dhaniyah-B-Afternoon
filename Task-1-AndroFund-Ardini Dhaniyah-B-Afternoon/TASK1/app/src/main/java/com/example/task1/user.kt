package com.example.task1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class user(
    val username:String,
    val password:String
):Parcelable
