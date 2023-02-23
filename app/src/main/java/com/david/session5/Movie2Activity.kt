package com.david.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.david.session5.databinding.ActivityMovie2Binding

class Movie2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityMovie2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun closeView(view: View){
        finish()
    }
}