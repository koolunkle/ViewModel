package com.sesac.androidpractice

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.sesac.androidpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    /* val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root) */

    val model: MainViewModel by viewModels()
    binding.button.setOnClickListener {
      model.calSum().observe(this) {
        binding.resultView.text = it
      }
    }
  }
}