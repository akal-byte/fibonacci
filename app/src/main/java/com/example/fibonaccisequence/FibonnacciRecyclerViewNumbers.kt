package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonnacciRecyclerViewNumbers(var fibonacciNumbersList:List<BigInteger>):RecyclerView.Adapter<FibonacciNumberViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciNumberViewHolder {
          var itemView=LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_number,parent,false)
          return FibonacciNumberViewHolder(itemView)
     }

     override fun onBindViewHolder(holder: FibonacciNumberViewHolder, position: Int)  {
          holder.tvnumbers.text=fibonacciNumbersList.get(position).toString()

     }

     override fun getItemCount(): Int {
          return fibonacciNumbersList.count()

     }
}
class FibonacciNumberViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
     var tvnumbers=itemView.findViewById<TextView>(R.id.tvnumbers)
}
