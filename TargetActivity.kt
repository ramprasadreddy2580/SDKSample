package com.example.sdksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.SDKSample.databinding.ActivityTargetBinding

class TargetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTargetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTargetBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}