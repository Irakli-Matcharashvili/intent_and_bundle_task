package com.example.intent_and_bundle_task

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name: String,
    val lastName: String,
    val job: String,
    val age: String,
): Parcelable