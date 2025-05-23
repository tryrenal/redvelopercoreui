package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUIInputBinding

class CoreUIInput : BaseFragment<FragmentCoreUIInputBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUIInputBinding {
        return FragmentCoreUIInputBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inputText.editTextContent = "Ini Set Text"
        binding.inputText.listenTextChanged {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }

        binding.inputEmail.listenTextChanged {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }

        binding.inputNumber.listenTextChanged {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }

        binding.inputPassword.listenTextChanged {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.inputText.removeListenTextChanged()
        binding.inputEmail.removeListenTextChanged()
        binding.inputNumber.removeListenTextChanged()
        binding.inputPassword.removeListenTextChanged()
    }

}