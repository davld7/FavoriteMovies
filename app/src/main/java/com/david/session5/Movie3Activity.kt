package com.david.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.david.session5.databinding.ActivityMovie3Binding

class Movie3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityMovie3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun closeView(view: View){
        finish()
    }
}