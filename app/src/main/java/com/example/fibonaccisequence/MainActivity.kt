package com.example.fibonaccisequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvfibonacci:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
       // displayNumbers(100)
    }
    fun castView(){
        rvfibonacci=findViewById(R.id.rvfibonacci)
        rvfibonacci.layoutManager=LinearLayoutManager(baseContext)
        var numsAdapter=FibonnacciRecyclerViewNumbers(displayNumbers(100))
        rvfibonacci.adapter=numsAdapter
    }
    fun displayNumbers(upto:Int):List<BigInteger>{
        var first=BigInteger.ZERO
        var next=BigInteger.ONE
        var nums= MutableList<BigInteger>(upto,{BigInteger.ZERO})
        nums[0]=first
        nums[1]=next
            for (i in 1..upto){
                var nums1=first+next
                first=next
                next=nums1
                nums[i-1]=first
            }
return nums
    }


}