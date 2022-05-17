package com.example.quemvotein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import android.content.Intent

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val idade = intent.getStringExtra("idade")
        idade_textview.text = "$idade anos"
        setUpListeners()
    }

    private fun setUpListeners(){
        cadastrar_button.setOnClickListener {
            val nome = nome_edittext.text.toString()
            val cidade = cidade_edittext.text.toString()

            val profileIntent = Intent(this, PerfilActivity::class.java)
            profileIntent.putExtra("nome", nome)
            profileIntent.putExtra("cidade", cidade)
            profileIntent.putExtra("idade", intent.getStringExtra("idade"))

            startActivity(profileIntent)
        }
    }

}

