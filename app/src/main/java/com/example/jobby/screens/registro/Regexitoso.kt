package com.example.jobby.screens.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobby.R
import com.example.jobby.databinding.FragmentCrearcuentaBinding
import com.example.jobby.databinding.FragmentRegexitosoBinding

class Regexitoso : Fragment() {
    private var _binding: FragmentRegexitosoBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegexitosoBinding.inflate(inflater,container,false)
        binding.btnEmpezar.setOnClickListener { findNavController().navigate(R.id.action_regexitoso_to_interes) }
        return binding.root
    }

}