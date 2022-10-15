package com.example.borboleta_ktv01.models

import android.graphics.drawable.Drawable

public class card(
    val id: Long = counter++,
    var name: String,
    var role: String,
    var description: String,
    var image: Drawable){

    companion object{
        private var counter = 0L
    }
}