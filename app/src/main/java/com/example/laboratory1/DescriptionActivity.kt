package com.example.laboratory1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.laboratory1.databinding.ActivityDescriptionBinding
import com.example.laboratory1.databinding.ActivityMainBinding

class DescriptionActivity : AppCompatActivity() {

    lateinit var binding: ActivityDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.AnimalText.text = intent.getStringExtra("Animal")?:""

        binding.AnimalDescription.text = intent.getStringExtra("Description")?:""

        val id_image = intent.getIntExtra("ImageID", -1)

        when (id_image) {
            1 -> binding.imageView.setImageResource(R.drawable.cat)
            2 -> binding.imageView.setImageResource(R.drawable.dog)
            3 -> binding.imageView.setImageResource(R.drawable.bird)
            else -> {
            }
        }
    }
}