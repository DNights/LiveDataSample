package com.dnights.livedatasample.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.dnights.livedatasample.R
import com.dnights.livedatasample.databinding.ActivityNameBinding
import com.dnights.livedatasample.viewmodel.NameViewModel
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {

    private lateinit var model: NameViewModel
    private lateinit var binding: ActivityNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProviders.of(this).get(NameViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_name)
        binding.lifecycleOwner = this
        binding.vm = model

        binding.button.setOnClickListener {
            val anotherName = "John Doe"
            model.currentName.setValue(anotherName)
        }
    }
}