package org.hambrouck.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.hambrouck.navdemo.databinding.FragmentSimpleBinding

class SimpleFragment : Fragment() {

    private var _binding: FragmentSimpleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSimpleBinding.inflate(inflater, container, false)

        val navController = findNavController()

        binding.button.setOnClickListener {
            navController.navigate(R.id.action_simpleFragment_to_loginFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}