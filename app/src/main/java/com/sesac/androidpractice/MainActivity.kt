package com.sesac.androidpractice

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.sesac.androidpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val model: MainViewModel by viewModels()
    binding.button.setOnClickListener {
      model.calSum().observe(this) {
        binding.resultView.text = it
      }
    }
  }
}