package com.example.bottommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.bottommenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        
        setContentView(binding.root)
        
        binding.bottomBar.setOnItemSelectedListener { item: MenuItem ->
            when(item.itemId){
                R.id.action_home -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()

            }
            
            true
        }
    }
}