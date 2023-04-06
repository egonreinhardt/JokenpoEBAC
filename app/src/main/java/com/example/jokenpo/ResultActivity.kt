package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jokenpo.databinding.ActivityPlayerBinding
import com.example.jokenpo.databinding.ActivityResultBinding

//Activity que representa a Tela 03 (Resultado)
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityResultBinding.inflate(layoutInflater) //Para usar o binding

        setContentView(binding.root) //Para usar o binding
        setSupportActionBar(binding.toolbar2) //AppBar (sem usar 'val toolbar' como na Tela 02)

        supportActionBar?.title = "Jokenpo" //Appbar
    }
}