package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.R
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUISearchBinding

class CoreUISearch : BaseFragment<FragmentCoreUISearchBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUISearchBinding {
        return FragmentCoreUISearchBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.search.listenTextChanged {
            binding.text.text = it
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.search.removeListenTextChanged()
    }

}