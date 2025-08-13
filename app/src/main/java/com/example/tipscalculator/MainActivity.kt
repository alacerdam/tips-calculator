package com.example.tipscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botão limpar
        binding.btnClean.setOnClickListener {
            println("Roque1 " + binding.tieTotal.text)
            println("Roque1 " + binding.tieNumPeople.text)
        }

        // Botão done
        binding.btnDone.setOnClickListener {
            val total = binding.tieTotal.text?.toString()
            val numPeople = binding.tieNumPeople.text?.toString()
            println("Total: $total, Número de pessoas: $numPeople")
        }
    }
}


