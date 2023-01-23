package com.example.bottommenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottommenu.databinding.FragmentMailBinding

class MailFragment : Fragment(){

    lateinit var binding: FragmentMailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}