package com.example.bottommenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottommenu.databinding.FragmentFavoritBinding

class FavoritFragment : Fragment(){

    lateinit var binding: FragmentFavoritBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFavoritBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}