package com.example.jokenpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.jokenpo.databinding.ActivityPlayerBinding
import com.google.android.material.navigation.NavigationView

//Activity da Tela 02 (Jogador).
class PlayerActivity : AppCompatActivity() {
    lateinit var drawer: DrawerLayout //Referência ao
    lateinit var navDrawer: NavigationView//Referência ao Navigation Drawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPlayerBinding.inflate(layoutInflater) //Para usar o binding
        val toolbar = binding.toolbar //AppBar

        setContentView(binding.root) //Para usar o binding
        setSupportActionBar(toolbar) //AppBar

        drawer = binding.root //Para fazer binding da
        navDrawer = binding.navView //Para fazer binding do Navigation Drawer

        setupToolBar()
        setupDrawer()
    }

    //Define o funcionamento da Navigation Draw, do Action Bar (botão sanduíche) (Responde clique do usuário)
    private fun setupDrawer(){
        navDrawer.setNavigationItemSelectedListener { menuItem ->
            drawer.closeDrawers()
            when(menuItem.itemId) {
                R.id.drawer_player -> {
                    val intent = Intent(this,PlayerActivity::class.java)
                    startActivity(intent) //Abre a tela 02
                    true
                }
                R.id.drawer_result -> {
                    val intent = Intent(this,ResultActivity::class.java)
                    startActivity(intent) //Abre a tela 03
                    true
                }
                else -> false
            }
        }
    }

    //Define a aparição do Action Bar
    private fun setupToolBar(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //Define que Action Bar mostrará botão home
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu) //Define o botão hamburger no lugar de home
    }


    override fun onSupportNavigateUp(): Boolean {
        drawer.openDrawer(GravityCompat.START)
        return true
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
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent) //Abre a Home
                true
            }
            else -> false
        }
    }
}