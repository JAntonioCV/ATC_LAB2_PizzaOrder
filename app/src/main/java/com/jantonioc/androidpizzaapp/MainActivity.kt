package com.jantonioc.androidpizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var rbSmall: RadioButton
    private lateinit var rbMedium: RadioButton
    private lateinit var rbLarge: RadioButton

    private lateinit var cbOnions: CheckBox
    private lateinit var cbOlives: CheckBox
    private lateinit var cbTomatoes: CheckBox
    private lateinit var btnOrder : Button

    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rbSmall = findViewById(R.id.rbSmall)
        rbMedium = findViewById(R.id.rbMedium)
        rbLarge = findViewById(R.id.rbLarge)

        cbOnions = findViewById(R.id.cbOnios)
        cbOlives = findViewById(R.id.cbOlives)
        cbTomatoes = findViewById(R.id.cbTomatoes)

        btnOrder = findViewById(R.id.btnOrder)

        tvResult = findViewById(R.id.txtTotal)

        btnOrder.setOnClickListener {
            var pizzaSizePrice = 0.0
            var toppingsTotal = 0.0

            when{
                rbSmall.isChecked -> pizzaSizePrice = 5.0
                rbMedium.isChecked -> pizzaSizePrice = 7.0
                rbLarge.isChecked -> pizzaSizePrice = 9.0
            }

            if(cbOnions.isChecked) {toppingsTotal += 1  }
            if(cbOlives.isChecked) {toppingsTotal += 2  }
            if(cbTomatoes.isChecked) {toppingsTotal += 3  }

            tvResult.text = "Total Order Price = ${pizzaSizePrice + toppingsTotal}"
        }





    }
}