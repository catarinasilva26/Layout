package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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
}