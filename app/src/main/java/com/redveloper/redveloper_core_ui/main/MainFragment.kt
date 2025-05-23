package com.redveloper.redveloper_core_ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private lateinit var mainAdapter: MainAdapter

    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainAdapter = MainAdapter()
        mainAdapter.setData(CoreUIPath.entries.map { it.path })

        binding.recycleview.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = mainAdapter
        }

        mainAdapter.listener = {
            getCoreUIPath(it)?.let { path ->
                findNavController().navigate(navigationTo(path))
            }
        }

    }

}