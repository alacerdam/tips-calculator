package com.example.tipscalculator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClean: Button = findViewById(R.id.btn_clean)
        val btnDone: Button = findViewById(R.id.btn_done)
        val edtTotal: TextInputEditText = findViewById(R.id.tie_total)
        val edtNumPeople: TextInputEditText = findViewById(R.id.tie_num_people)

        btnClean.setOnClickListener {
            println("Roque1" + edtTotal.text)
        println("Roque1" + edtNumPeople.text)
        }
    }
}
