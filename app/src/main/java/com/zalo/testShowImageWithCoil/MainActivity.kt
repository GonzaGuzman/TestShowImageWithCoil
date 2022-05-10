package com.zalo.testShowImageWithCoil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zalo.testdownloadimageofinternt.R
import com.zalo.testdownloadimageofinternt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonContinue.setOnClickListener{
            saveUrl()
        }
    }

    private fun saveUrl() {
        val intent = Intent(this, MainActivity2::class.java)
        if (binding.addURL.text.isNotEmpty()) {
            intent.putExtra("add", binding.addURL.text.toString())
            startActivity(intent)

        }else{
            Toast.makeText(this,getString(R.string.add_url), Toast.LENGTH_SHORT).show()
        }
    }
}