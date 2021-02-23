package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "nome"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button2(view: View) {
        //Pegamos no texto inserido no EditText
        var editText = findViewById<EditText>(R.id.editTextTextPersonName)
        // Criamos um toast a mostrar o texto de EditText
        Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        // Inserimos o texto do EditText no TextVe«iew Indicado
        findViewById<TextView>(R.id.textView).setText(editText.text)
    }

    fun button1(view: View) {
        //Pegamos no texto inserido no EditText
        var editText = findViewById<EditText>(R.id.editTextTextPersonName)
        // Passamos o texto do editText1 para a nova atividade
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, editText.text.toString())
        }
        startActivity(intent)
    }
}