package com.example.quemvotein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        avancar_button.setOnClickListener{
            val idade = idade_edittext.text.toString()
            idade_edittext.setText("")
            val status = deveVotar(idade.toInt())

            if (status == PROIBIDO){
                Toast.makeText(this,
                    "Você NÃO PODE usar este APP ainda!",
                    Toast.LENGTH_LONG).show()
            } else {
                val cadastroIntent = Intent(this, CadastroActivity::class.java)
                cadastroIntent.putExtra("idade", idade)
                startActivity(cadastroIntent)
            }
        }
    }
}