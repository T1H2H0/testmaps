package com.whirlpool.testmaps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val geotext=address.text.toString()
map_button.setOnClickListener { map(address.text.toString()) }
        search_button.setOnClickListener { search(address.text.toString()) }
    }



    fun search(geo:String){
        val gmmIntentUri = Uri.parse("geo:0,0?q=$geo")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)

    }
    fun map(geo:String){
        val gmmIntentUri =
            Uri.parse("google.navigation:q=$geo")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}