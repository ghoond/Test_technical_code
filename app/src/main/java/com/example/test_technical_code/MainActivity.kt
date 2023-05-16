package com.example.test_technical_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.time.format.TextStyle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val prime_btn = findViewById(R.id.prima)
        val odd_btn = findViewById(R.id.ganjil)
        val num = findViewById(R.id.input_number)
        val tv = findViewById(R.id.tv_result)
        val txtValue: Int = num.getText().toString()
            super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        prime_btn.setOnClickListener(){

        }

        odd_btn.setOnClickListener(){
            for (i in 1 ... txtValue){
                if(i % 3 == 2)
                    print(i)

        }
        }
    }
}