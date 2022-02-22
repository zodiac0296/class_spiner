package com.example.spiner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val list = listOf("Android","IOS","BECKEND")
        spinnerAdapterSet(spinner,list)
        setListener(spinner)
    }

    fun spinnerAdapterSet(spinner: Spinner,list: List<String>){
    val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,list)
        spinner.adapter = adapter
    }
    fun setListener(spinner: Spinner) {
        spinner.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            )
            {
                Toast.makeText(this@MainActivity,parent.selectedItem.toString(),Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}