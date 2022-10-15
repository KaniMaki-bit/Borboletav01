package com.example.borboleta_ktv01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.borboleta_ktv01.databinding.ActivityMainBinding
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.StackFrom
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val cards: MutableList<card> = ArrayList()
        cards.add(
            card(
                "Profesional 1",
                "Asesor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                ResourcesCompat.getDrawable(resources, R.drawable.ejemplo1, null)!!
            )
        )
        cards.add(
            card(
                "Profesional 2",
                "Terapeuta",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                ResourcesCompat.getDrawable(resources, R.drawable.ejemplo2, null)!!
            )
        )
        val adapter = card_adapter(cards)
        binding!!.cardStack.layoutManager = CardStackLayoutManager(applicationContext)
        binding!!.cardStack.adapter = adapter
        CardStackLayoutManager(applicationContext).setStackFrom(StackFrom.Top)
    }
}