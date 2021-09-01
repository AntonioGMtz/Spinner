package com.gama.k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.gama.k.databinding.ActivityMainBinding
import java.text.FieldPosition
import java.util.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var mBinding : ActivityMainBinding
    private lateinit var aaCountries : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        aaCountries = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item)
        aaCountries.addAll(Arrays.asList(" ","México","Bulgaria","Alemania","USA","Brasil"))
        aaCountries.add("Rusia")
        mBinding.spinnerCountries.onItemSelectedListener = this
        mBinding.spinnerCountries.adapter = aaCountries
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position : Int, p3: Long) {
        val myCountry = aaCountries.getItem(position)
        mBinding.tvSelected.text = "You select $myCountry as your country"
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}