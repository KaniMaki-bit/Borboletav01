package com.example.borboleta_ktv01

import android.graphics.drawable.Drawable

public class card(private var name: String,
                  private var role: String,
                  private var description: String,
                  private var image: Drawable){

    fun getName(): String {return this.name}
    fun getDescription(): String {return this.description}
    fun getRole(): String {return this.role}
    fun getImage(): Drawable {return this.image}
}