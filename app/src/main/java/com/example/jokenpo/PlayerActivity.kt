package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    //Define que o Action Bar que aparecerá na tela do app é o nosso action_bar.xml
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar,menu)
        return true
    }

    //Define a função do botão dentro do menu flutuante (3 pontinhos) da Action Bar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_bar_home -> {
                //ADICIONAR AQUI A FUNÇÃO DE LEVAR À HOME.
                true
            }
            else -> false
        }
    }
}