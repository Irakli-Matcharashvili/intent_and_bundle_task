package com.example.intent_and_bundle_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class user_result_activity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var lastNameTextView: TextView
    private lateinit var userAgeTextView: TextView
    private lateinit var userJobTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_result)
        nameTextView = findViewById(R.id.nameTextView)
        lastNameTextView = findViewById(R.id.lastNameTextView)
        userAgeTextView = findViewById(R.id.userAgeTextView)
        userJobTextView = findViewById(R.id.userJobTextView)


        nameTextView.text = intent.getStringExtra("name")
        lastNameTextView.text = intent.getStringExtra("last name")
        userAgeTextView.text = intent.getStringExtra("age")
        userJobTextView.text = intent.getStringExtra("job")

    }
}