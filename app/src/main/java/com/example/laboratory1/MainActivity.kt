package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.laboratory1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat_image: ImageView = findViewById(R.id.imageView1)
        cat_image.setImageResource(R.drawable.cat)
        val dog_image: ImageView = findViewById(R.id.imageView2)
        dog_image.setImageResource(R.drawable.dog)
        val bird_image: ImageView = findViewById(R.id.imageView3)
        bird_image.setImageResource(R.drawable.bird)

        binding.catBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Animal", binding.catView.text.toString())
            intent.putExtra("Description", binding.catDescription.text.toString())
            intent.putExtra("ImageID",1)

            startActivity(intent)
        }
        binding.dogBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Animal", binding.dogView.text.toString())
            intent.putExtra("Description", binding.dogDescription.text.toString())
            intent.putExtra("ImageID",2)

            startActivity(intent)
        }
        binding.birdBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Animal", binding.birdView.text.toString())
            intent.putExtra("Description", binding.birdDescription.text.toString())
            intent.putExtra("ImageID",3)

            startActivity(intent)
        }
    }
}