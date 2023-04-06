package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jokenpo.databinding.ActivityPlayerBinding

//Activity que representa a Tela 02 (Jogador).
class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPlayerBinding.inflate(layoutInflater) //Para usar o binding
        val toolbar = binding.toolbar //AppBar

        setContentView(binding.root) //Para usar o binding
        setSupportActionBar(toolbar) //AppBar

        supportActionBar?.title = "Jokenpo" //Appbar
    }
}