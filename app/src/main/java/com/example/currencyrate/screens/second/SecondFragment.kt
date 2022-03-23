package com.example.currencyrate.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.currencyrate.R
import com.example.currencyrate.databinding.FragmentSecondBinding
import com.example.currencyrate.databinding.FragmentStartBinding
import com.example.currencyrate.screens.start.StartAdapter
import com.example.currencyrate.screens.start.StartViewModel


class SecondFragment : Fragment() {

    lateinit var adapter: SecondAdapter

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProvider(this).get(SecondViewMode::class.java)
        _binding = FragmentSecondBinding.inflate(layoutInflater)
        adapter = SecondAdapter()
        binding.rvSecond.adapter = adapter

        viewModel.secondList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setData(it) }
        }

        return binding.root
    }

}