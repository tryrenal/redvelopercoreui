package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUIAppbarBinding

class CoreUIAppbar : BaseFragment<FragmentCoreUIAppbarBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUIAppbarBinding {
        return FragmentCoreUIAppbarBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.appbarWithoutText.onBack {
            findNavController().popBackStack()
        }

        binding.appbarWithText.setAppbarText("Text Hint")
        binding.appbarWithText.onBack {
            findNavController().popBackStack()
        }

    }

}