package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
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

    //------------------Funções Necesárias para mostrar o menu------------------
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        //Selecionar o menu que pretendemos mostrar
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Mediante o itemId selecionado mostrar um toast diferente
        return when ( item.itemId){
            R.id.create_new -> {
                Toast.makeText(this, "create_new", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this, "opcao2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this, "opcao3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao4 -> {
                Toast.makeText(this, "opcao4", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    //---------------------------------------------------------------------------
}