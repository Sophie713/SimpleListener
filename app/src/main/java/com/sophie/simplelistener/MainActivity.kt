package com.sophie.simplelistener

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //I create my connected class
    val waitAndUpdateTextView = WaitAndUpdateTextView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //I set the listener
        waitAndUpdateTextView.setListener(object :
        //I create an object from the interface
            WaitAndUpdateTextView.MyListener {
            //I write what the function is supposed to do
            override fun postBack(newText: String) {
                runOnUiThread { hello_world.setText(newText) }
            }
        })

        //use the function on button click
        button.setOnClickListener {
            waitAndUpdateTextView.waitAndUpdate(edit_text.text.toString())
            edit_text.setText("")
        }
    }
}
