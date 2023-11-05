package com.example.laboratory1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.laboratory1.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: AnimalAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = ArrayList<Animal>()
        list.add(Dog("Rex", 5, "A loyal and playful dog. Loves long walks in the park.", R.drawable.dog))
        list.add(Cat("Jack", 4, "An independent and curious cat. Enjoys lounging in the sun.", R.drawable.cat))
        list.add(Bird("Minder", 1, "A colorful and chirpy bird. Sings beautiful melodies.", R.drawable.bird))
        list.add(Fish("Fredy", 3, "A graceful swimmer in the aquarium. Loves exploring caves.", R.drawable.fish))
        list.add(Snake("Bosman", 2, "A quacking waterfowl. Enjoys paddling in the pond.", R.drawable.snake))

        adapter = AnimalAdapter { animal, position ->
            val action = FirstFragmentDirections.actionFirstFragmentToDescriptionFragment(animal.name, animal.description, animal.imageResId, animal.age)
            findNavController().navigate(action)
            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT).show()
        }
        adapter.setList(list)
        binding.rv.adapter = adapter

        binding.btnToNext.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToDescriptionFragment("Some string", "", R.drawable.placeholder_image, 0))
        }
    }
}


//class FirstFragment : Fragment() {
//    lateinit var binding: FragmentFirstBinding
//    lateinit var adapter: AnimalAdapter
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false)
//        binding = FragmentFirstBinding.inflate(layoutInflater, container,false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val list = ArrayList<Animal>()
//        list.add(Dog("Rex", 5))
//        list.add(Cat("Jack", 4))
//        list.add(Bird("Minder", 1))
//        list.add(Fish("Fredy", 3))
//        list.add(Duck("Bosman", 2))
//
//        adapter = AnimalAdapter(){ animal, position ->
//            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToDescriptionFragment(animal.name))
//            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT).show()
//        }
//        adapter.setList(list)
//        binding.rv.adapter = adapter
//
//        binding.btnToNext.setOnClickListener {
//            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToDescriptionFragment("Some string"))
//        }
//    }
//}