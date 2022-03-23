package com.example.currencyrate.screens.start

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    lateinit var adapter: StartAdapter

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        _binding = FragmentStartBinding.inflate(layoutInflater)
        adapter = StartAdapter()
        binding.rvStart.adapter = adapter

        viewModel.startList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setData(it) }

        }

        return binding.root
    }

}