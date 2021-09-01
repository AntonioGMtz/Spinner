package com.gama.k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.ArrayAdapter
import com.gama.k.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val aaCountries = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item)
        mBinding.spinnerCountries.adapter = aaCountries
    }
}