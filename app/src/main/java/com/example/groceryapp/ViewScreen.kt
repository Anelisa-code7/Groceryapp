package com.example.groceryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewScreen : AppCompatActivity() {

    lateinit var btnBack: Button
    lateinit var btnGear: Button
    lateinit var txtItemName: EditText
    lateinit var txtCategory: EditText
    lateinit var txtQuantity: EditText
    lateinit var txtComments: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBack = findViewById(R.id.btnBack)
        btnGear = findViewById(R.id.btnGear)
        txtItemName = findViewById(R.id.txtItemName)
        txtCategory = findViewById(R.id.txtCategory)
        txtQuantity = findViewById(R.id.txtQuantity)
        txtComments = findViewById(R.id.txtComments)

        val items = intent.getStringArrayExtra("items")
        val categories = intent.getStringArrayExtra("categories")
        val quantities = intent.getIntArrayExtra("quantities")
        val comments = intent.getStringArrayExtra("comments")

        items?.let { txtItemName.setText(it.joinToString(", ")) }
        categories?.let { txtCategory.setText(it.joinToString(", ")) }
        quantities?.let { txtQuantity.setText(it.joinToString(", ")) }
        comments?.let { txtComments.setText(it.joinToString(", ")) }

        btnBack.setOnClickListener {
            finish()
        }

        btnGear.setOnClickListener {
            // Handle gear checklist logic if needed
        }
    }
}
