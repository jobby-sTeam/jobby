package com.example.jobby.screens.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.jobby.R
import com.example.jobby.databinding.FragmentCrearcuentaBinding

class Crearcuenta : Fragment() {
    private var _binding: FragmentCrearcuentaBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCrearcuentaBinding.inflate(inflater,container,false)
        binding.btnSiguiente.setOnClickListener {
            findNavController().navigate(R.id.action_crearcuenta_to_experiencialab)
        }
        return binding.root
    }
}