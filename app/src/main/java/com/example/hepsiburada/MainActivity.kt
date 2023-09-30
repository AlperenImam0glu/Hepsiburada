package com.example.hepsiburada

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.get
import com.example.hepsiburada.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.bottomNavigationView.itemActiveIndicatorColor


        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.homepageFragment -> {

                      true
                }
                R.id.categoryFragment -> {
                    showToast()
                    false
                }
                R.id.cartFragment -> {
                    showToast()
                    false
                }
                R.id.favoriteFragment -> {
                    showToast()
                    false
                }
                R.id.allCategoriesFragment -> {
                    showToast()
                    false
                }
                else -> false
            }
        }

        setContentView(binding.root)
    }

    fun showToast(){
        Toast.makeText(this,"In Development",Toast.LENGTH_SHORT).show()

    }
}