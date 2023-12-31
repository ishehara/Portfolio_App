package com.example.portfolio_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        val buttonWork = findViewById<Button>(R.id.btnWork)
        val buttonAchivement = findViewById<Button>(R.id.btnAchivements)
        val buttonEducation = findViewById<Button>(R.id.btnEdu)

        buttonSkills.setOnClickListener(){

            intent = Intent(this, skillsActivity::class.java) // explicit intent
            startActivity(intent)

        }
        buttonWork.setOnClickListener(){

            intent = Intent(this, workActivity::class.java) // explicit intent
            startActivity(intent)

        }
        buttonAchivement.setOnClickListener(){

            intent = Intent(this, achivementActivity::class.java) // explicit intent
            startActivity(intent)

        }
        buttonEducation.setOnClickListener(){

            intent = Intent(this, educationActivity::class.java) // explicit intent
            startActivity(intent)

        }
    }
}