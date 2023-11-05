package com.example.laboratory1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.databinding.FragmentFirstBinding
import com.example.laboratory1.databinding.ItemAnimalBinding

class AnimalAdapter(private val onItemClick: (Animal, Int) -> Unit) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    private var animalList: List<Animal> = emptyList()

    inner class AnimalViewHolder(private val binding: ItemAnimalBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: Animal, position: Int) {
            binding.apply {
                iv.setImageResource(animal.imageResId)
                animalName.text = animal.name
                shortDescription.text = animal.description
                btn.setOnClickListener { onItemClick(animal, position) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animalList[position]
        holder.bind(animal, position)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    fun setList(animalList: List<Animal>) {
        this.animalList = animalList
        notifyDataSetChanged()
    }
}