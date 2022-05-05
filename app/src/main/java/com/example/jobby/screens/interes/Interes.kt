package com.example.jobby.screens.interes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobby.R
import com.example.jobby.databinding.FragmentInteresBinding
import com.example.jobby.databinding.FragmentLoginBinding

class Interes : Fragment() {
    private var _binding: FragmentInteresBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInteresBinding.inflate(inflater, container, false)
        binding.btnEmpezar.setOnClickListener {
            findNavController().navigate(R.id.action_interes_to_listatrabajos)
        }
        return binding.root
    }


}