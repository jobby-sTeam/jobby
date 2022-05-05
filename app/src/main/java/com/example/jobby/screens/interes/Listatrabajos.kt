package com.example.jobby.screens.interes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.jobby.R
import com.example.jobby.databinding.FragmentInteresBinding
import com.example.jobby.databinding.FragmentListatrabajosBinding


class Listatrabajos : Fragment() {
    private var _binding: FragmentListatrabajosBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListatrabajosBinding.inflate(inflater, container, false)
        binding.btnEmpezar.setOnClickListener {
            Toast.makeText(context,"Holis", Toast.LENGTH_SHORT).show()
        }
        return binding.root

    }

}