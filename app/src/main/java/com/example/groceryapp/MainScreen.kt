package com.example.groceryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    lateinit var btnAddGear : Button
    lateinit var btnViewChecklist : Button
    lateinit var txtTotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnAddGear = findViewById(R.id.btnAddGear)
        btnViewChecklist = findViewById(R.id.btnViewChecklist)
        txtTotal = findViewById(R.id.txtTotal)

        // Parallel arrays
        val itemNames = arrayOf(
            "Tent",
            "Marshmallows",
            "Flashlight"
        )

        val categories = arrayOf(
            "Shelter",
            "Food",
            "Safety"
        )

        val quantities = intArrayOf(
            1,
            3,
            2
        )

        val comments = arrayOf(
            "4-person waterproof",
            "For S'mores (Mega size)",
            "Check batteries (AA)"
        )

        // Calculate total items using a loop
        var totalItems = 0
        for (quantity in quantities) {
            totalItems += quantity
        }

        txtTotal.text = getString(R.string.total_items_packed, totalItems)

        // Open Detailed View Screen
        btnViewChecklist.setOnClickListener {
            val intent = Intent(this, ViewScreen::class.java)

            intent.putExtra("items", itemNames)
            intent.putExtra("categories", categories)
            intent.putExtra("quantities", quantities)
            intent.putExtra("comments", comments)

            startActivity(intent)
        }
    }
}
