package com.example.jokenpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jokenpo.databinding.ActivityMainBinding

//Activity que representa a Tela 01 (Inicial).
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding para mudança de tela. Ação ocorre no botão "Iniciar"
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Variável activity2Intent refere-se à Tela 02 (Jogador).
        val activity2Intent = Intent(this,PlayerActivity::class.java)

        //Ação do botão "Iniciar" que leva à Tela 02 (Jogador).
        binding.startActivityButton.setOnClickListener {
            startActivity(activity2Intent)
        }
    }
}