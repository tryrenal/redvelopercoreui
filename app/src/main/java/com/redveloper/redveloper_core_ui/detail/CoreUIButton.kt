package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUIButtonBinding

class CoreUIButton : BaseFragment<FragmentCoreUIButtonBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUIButtonBinding {
        return FragmentCoreUIButtonBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPrimaryDisable.isEnable(false)

        binding.btnPrimary.onClick {
            Toast.makeText(requireContext(), "button primary click", Toast.LENGTH_SHORT).show()
        }

        binding.btnPrimaryIc.onClick {
            Toast.makeText(requireContext(), "button primary icon click", Toast.LENGTH_SHORT).show()
        }

        binding.btnSecondary.onClick {
            Toast.makeText(requireContext(), "button secondary click", Toast.LENGTH_SHORT).show()
        }

        binding.btnSecondaryIc.onClick {
            Toast.makeText(requireContext(), "button secondary ic click", Toast.LENGTH_SHORT).show()
        }
    }

}