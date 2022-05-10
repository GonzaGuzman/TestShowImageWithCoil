package com.zalo.testShowImageWithCoil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import com.zalo.testShowImageWithCoil.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        showImage()
    }

    private fun showImage() {
        val imageUrlIntent = intent.getStringExtra("add")

        val imgUri = imageUrlIntent?.toUri()?.buildUpon()?.scheme("https")?.build()
            binding.imageView.load(imgUri) {
                    placeholder(R.drawable.loading_animation)
                    error(R.drawable.ic_broken_image)
                }
            }

    }



