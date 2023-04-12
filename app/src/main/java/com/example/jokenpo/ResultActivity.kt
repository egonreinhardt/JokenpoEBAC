package com.example.jokenpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.jokenpo.databinding.ActivityPlayerBinding
import com.example.jokenpo.databinding.ActivityResultBinding

//Activity da Tela 03 (Resultado)
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityResultBinding.inflate(layoutInflater) //Para usar o binding

        setContentView(binding.root) //Para usar o binding
        setSupportActionBar(binding.toolbar2) //AppBar (sem usar 'val toolbar' como na Tela 02)

        supportActionBar?.title = "Jokenpo" //Appbar
    }

    //Define a função do botão dentro do menu flutuante (3 pontinhos) da Action Bar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_bar_home -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent) //Abre a Home
                true
            }
            else -> false
        }
    }
}
