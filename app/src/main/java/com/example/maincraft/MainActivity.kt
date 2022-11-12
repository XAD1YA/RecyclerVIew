package com.example.maincraft

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecylerView:RecyclerView
    private lateinit var newArrayList: ArrayList<Speed>
    lateinit var imageId:ArrayList<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayListOf(
            R.drawable.buggati,
            R.drawable.aston,
            R.drawable.z,
            R.drawable.sport,
            R.drawable.dodge,
            R.drawable.rangerover,
            R.drawable.audi,
        )
        heading= arrayOf(
        "very beautiful car",
        "very expansive car",
        "Speed car and expansive",
        "Very high speed",
        "I love that car)",
        "Family car and for travel",
        "Grip is well"
        )
        newRecylerView=findViewById(R.id.recylerView)
        newRecylerView.layoutManager=LinearLayoutManager(this)
        newRecylerView.setHasFixedSize(true)

        newArrayList= arrayListOf<Speed>()
        getUserData()

    }

    private fun getUserData() {
        for (i in imageId.indices){
            val  speed=Speed(imageId[i],heading[i])
            newArrayList.add(speed)

        }

        newRecylerView.adapter=Xone(newArrayList)
    }
}






















