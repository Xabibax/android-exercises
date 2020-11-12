package fr.android.androidexercises

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book(val name: String = "No Book", val author: String = "No Author"): Parcelable
