package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUICheckedBinding
import com.redveloper.core_ui.R as CoreR

class CoreUIChecked : BaseFragment<FragmentCoreUICheckedBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUICheckedBinding {
        return FragmentCoreUICheckedBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.checkOne.onChecked {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.checkTwo.setLabel("label set from fragment")
        binding.checkTwo.onChecked {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.checkThree.setColorLabel(CoreR.color.green)
        binding.checkThree.setChecked(true)
        binding.checkThree.onChecked {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}