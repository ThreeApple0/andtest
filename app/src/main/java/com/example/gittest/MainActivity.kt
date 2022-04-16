package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // testtest


    fun cul(i:Int){
        var toast:Toast = Toast.makeText(this,"값이 없습니다",Toast.LENGTH_SHORT)

        if( num1.text.toString() == "" || num2.text.toString() == ""){
            toast.cancel()
            toast.show()
            return
        }

        var num1_int:Int = (num1.text).toString().toInt()
        var num2_int:Int = (num2.text).toString().toInt()

        if(i==1){
            res.setText((num1_int + num2_int).toString())
        }
        else if(i==2){
            res.setText((num1_int - num2_int).toString())
        }
        else if(i==3){
            res.setText((num1_int * num2_int).toString())
        }
        else if(i==4){
            res.setText((num1_int.toFloat() / num2_int).toString())
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        p_bt.setOnClickListener(){
            cul(1)
        }
        m_bt.setOnClickListener(){
            cul(2)
        }
        x_bt.setOnClickListener(){
            cul(3)
        }
        n_bt.setOnClickListener(){
            cul(4)

        }

    }



}
