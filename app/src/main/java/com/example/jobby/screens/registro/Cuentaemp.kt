package com.example.jobby.screens.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobby.R
import com.example.jobby.databinding.FragmentCrearcuentaBinding
import com.example.jobby.databinding.FragmentCuentaempBinding

class Cuentaemp : Fragment() {
    private var _binding: FragmentCuentaempBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCuentaempBinding.inflate(inflater,container,false)
        binding.btnSiguiente2.setOnClickListener {
            findNavController().navigate(R.id.action_cuentaemp_to_datoscont)
        }
        return binding.root
    }

}