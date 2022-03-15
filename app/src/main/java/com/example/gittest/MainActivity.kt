package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var toast:Toast = Toast.makeText(this.applicationContext,"",Toast.LENGTH_SHORT)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener {
            toast.cancel()
            toast = Toast.makeText(this.applicationContext,"테스트 A",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show()
        }
        bt2.setOnClickListener {
            toast.cancel()
            toast = Toast.makeText(this.applicationContext,"테스트 B",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show()
        }
    }
}