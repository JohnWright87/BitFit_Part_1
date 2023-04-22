package com.example.bitfitpart1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class NutritionActivity : AppCompatActivity() {
    private lateinit var nutritionRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_nutrition)
        val nutritionInputET : EditText = findViewById(R.id.nutritionInputET)
        val calorieCountET : EditText = findViewById(R.id.caloriesInputET)
        val recordInputBt : Button = findViewById(R.id.recordInputBtn)

        recordInputBt.setOnClickListener(View.OnClickListener {

            val resultIntent = Intent()
            resultIntent.putExtra("result", Nutrition(nutritionName = nutritionInputET.text.toString(), calorieCount = calorieCountET.text.toString()))
            setResult(RESULT_OK, resultIntent)
            finish()
        })
    }
}