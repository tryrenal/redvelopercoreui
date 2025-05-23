package com.redveloper.redveloper_core_ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.redveloper.core_ui.components.spinner.RedveloperSpinnerModel
import com.redveloper.core_ui.utils.BaseFragment
import com.redveloper.redveloper_core_ui.R
import com.redveloper.redveloper_core_ui.databinding.FragmentCoreUISpinnerBinding

class CoreUISpinner : BaseFragment<FragmentCoreUISpinnerBinding>() {
    override fun inflate(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCoreUISpinnerBinding {
        return FragmentCoreUISpinnerBinding.inflate(inflater, container, false)
    }

    private val itemsSpinner = listOf<RedveloperSpinnerModel>(
        RedveloperSpinnerModel(key = "1", value = "Indonesia"),
        RedveloperSpinnerModel(key = "2", value = "Inggris"),
        RedveloperSpinnerModel(key = "3", value = "Malaysia"),
        RedveloperSpinnerModel(key = "4", value = "Australia"),
        RedveloperSpinnerModel(key = "5", value = "India"),
        RedveloperSpinnerModel(key = "6", value = "Pakistan"),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.exampleSpinner.apply {
            setData(itemsSpinner)
            setSelectedKey(key = itemsSpinner[2].key, value = itemsSpinner[2].value)
            selectedItemCallback = {
                binding.exampleText.text = it.value
            }
        }

    }

}