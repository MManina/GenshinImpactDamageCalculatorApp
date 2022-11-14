package com.manina.genshinimpactdamagecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.manina.genshinimpactdamagecalculator.databinding.ActivityAddCharacterFormBinding

class AddCharacterForm : AppCompatActivity() {

    private lateinit var binding: ActivityAddCharacterFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCharacterFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar = supportActionBar
        actionBar!!.title = "Create new character"
        actionBar.setDisplayHomeAsUpEnabled(true)

        var etTitle = findViewById<EditText>(R.id.et_form_title)
        var etName = findViewById<EditText>(R.id.et_form_name)

        binding.submitButton.setOnClickListener{
            val title = etTitle.text
            val name = etName.text
            val intent = Intent(this@AddCharacterForm, MainActivity::class.java)
            intent.putExtra("title", title)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}