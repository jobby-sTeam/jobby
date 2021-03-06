package com.example.jobby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobby.databinding.FragmentLoginBinding

class Login : Fragment() {
    private var _binding: FragmentLoginBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btnSesion.setOnClickListener {
            findNavController().navigate(R.id.action_login2_to_listatrabajos)
        }
        return binding.root
    }

}