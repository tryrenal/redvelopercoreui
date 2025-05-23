package com.redveloper.core_ui.components

import android.content.Context
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.redveloper.core_ui.R as CoreR

class RedveloperSearch: BaseCustomView {

    private lateinit var etSearch: EditText
    private var textWatcher: TextWatcher? = null

    constructor(context: Context): super(context)
    constructor(context: Context, attr: AttributeSet?): super(context, attr){
        setupLayout()
        readAttributes(attr)
    }
    constructor(context: Context, attr: AttributeSet?, defStyleAttr: Int): super(context,attr, defStyleAttr){
        setupLayout()
        readAttributes(attr)
    }

    private fun setupLayout(){
        val view = LayoutInflater.from(context).inflate(CoreR.layout.redveloper_search, this, false)
        addView(view)

        etSearch = findViewById<EditText>(CoreR.id.et_search)
    }

    private fun readAttributes(attrs: AttributeSet?){
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(attrs, CoreR.styleable.RedveloperSearch)
            setHint(typedArray.getString(CoreR.styleable.RedveloperSearch_hintSearch) ?: "")
            typedArray.recycle()
        }
    }

    fun setHint(hint: String){
        if (hint.isNotBlank())
            etSearch.setHint(hint)
    }

    var editTextContent: String?
        get() = etSearch.text.toString()
        set(value) {
            etSearch.setText(value)
        }

    fun listenTextChanged(callback: ((String) -> Unit)){
        textWatcher = etSearch.addTextChangedListener{
            callback.invoke(it.toString())
        }
    }

    fun removeListenTextChanged(){
        etSearch.removeTextChangedListener(textWatcher)
    }
}