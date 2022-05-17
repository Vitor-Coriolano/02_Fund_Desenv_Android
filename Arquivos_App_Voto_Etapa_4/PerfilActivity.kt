package com.example.quemvotein

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        recuperarDados()
    }

    fun recuperarDados(){
        val nome = intent.getStringExtra("nome")
        val cidade = intent.getStringExtra("cidade")
        val idade = intent.getStringExtra("idade")

        nome_textview.text = nome
        cidade_textview.text = cidade
        idade_textview.text = idade
    }
}
