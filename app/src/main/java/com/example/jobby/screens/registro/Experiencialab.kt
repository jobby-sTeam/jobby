package com.example.jobby.screens.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobby.R
import com.example.jobby.databinding.FragmentCuentaempBinding
import com.example.jobby.databinding.FragmentExperiencialabBinding


class Experiencialab : Fragment() {
    private var _binding: FragmentExperiencialabBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperiencialabBinding.inflate(inflater,container,false)
        binding.btnSiguiente1.setOnClickListener {
            findNavController().navigate(R.id.action_experiencialab_to_datoscont)
        }
        return binding.root
    }
}