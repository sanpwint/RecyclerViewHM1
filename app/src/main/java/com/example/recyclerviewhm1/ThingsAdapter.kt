package com.example.recyclerviewhm1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_things.view.*

class ThingsAdapter( var thingsList: ArrayList<Things>):
    RecyclerView.Adapter<ThingsAdapter.ThingsViewHolder>(){

    inner class ThingsViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView){

        fun bindThings(things: Things){
            itemView.name.text = things.name
            itemView.text1.text = things.text1
            itemView.image2.setImageResource(things.profileImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThingsViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_things,parent, false)
        return ThingsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return thingsList.size
    }

    override fun onBindViewHolder(holder: ThingsViewHolder, position: Int) {
        holder.bindThings(thingsList[position])
    }
}

