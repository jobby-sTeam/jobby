package com.example.jobby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.jobby.databinding.FragmentBienvenidaBinding


class Bienvenida : Fragment() {
    private var _binding: FragmentBienvenidaBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBienvenidaBinding.inflate(inflater,container,false)
        opcion()
        return  binding.root
    }

    private fun opcion(){
        binding.btnCuenta.setOnClickListener { vista:View ->
            with(vista) { findNavController().navigate(R.id.action_bienvenida_to_crearcuenta) }
        }
        binding.btnSesion.setOnClickListener { vista:View ->
            with(vista) { findNavController().navigate(R.id.action_bienvenida_to_login2) }
        }
    }
}