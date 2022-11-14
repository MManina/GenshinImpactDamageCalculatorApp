package com.manina.genshinimpactdamagecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import com.manina.genshinimpactdamagecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var characterList: ArrayList<Character>

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        characterList = arrayListOf<Character>()

        binding.AddCharacterButton.setOnClickListener{
            val intent = Intent(this@MainActivity, AddCharacterForm::class.java)
            startActivity(intent)
            //var button = createButton()
            //characterList.add(button)
            //binding.table.addView(button)
        }

        if (intent != null){
            val title = intent.getStringExtra("title").toString()
            val name = intent.getStringExtra("name").toString()
            var button = createButton(title)
            binding.table.addView(button)
        }

    }

    private fun createButton(title: String): Button{
        var newButton = Button(this)

        newButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        newButton.text = title

        return newButton
    }

    /*private fun addButtonToTable(){
        binding.table.addView(characterList.last())
    }*/
}