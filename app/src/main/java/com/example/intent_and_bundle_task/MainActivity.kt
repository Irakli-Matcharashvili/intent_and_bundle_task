package com.example.intent_and_bundle_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var jobEditText: EditText
    private lateinit var profileButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.nameEditText)
        lastNameEditText = findViewById(R.id.lastNameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        jobEditText = findViewById(R.id.jobEditText)
        profileButton = findViewById(R.id.profileButton)
        profileButton.setOnClickListener {
            val intent = Intent(this,user_result_activity::class.java)
            intent.putExtra("name",nameEditText.text.toString())
            intent.putExtra("last name",lastNameEditText.text.toString())
            intent.putExtra("age",ageEditText.text.toString())
            intent.putExtra("job",jobEditText.text.toString())

            startActivity(intent)
        }
    }
}