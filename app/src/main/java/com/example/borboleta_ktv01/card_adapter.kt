package com.example.borboleta_ktv01

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.borboleta_ktv01.card_adapter.myViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.borboleta_ktv01.databinding.CardBinding

class card_adapter(var cardList: List<card>) : RecyclerView.Adapter<myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding = CardBinding.inflate(li)
        return myViewHolder(binding)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val cardItem = cardList[position]
        holder.binding.name.text = cardItem.getName()
        holder.binding.role.text = cardItem.getRole()
        holder.binding.description.text = cardItem.getDescription()
        holder.binding.image.setImageDrawable(cardItem.getImage())
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    class myViewHolder(var binding: CardBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}