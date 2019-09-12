package com.dnights.livedatasample.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.dnights.livedatasample.R
import com.dnights.livedatasample.viewmodel.NameViewModel
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {

    private lateinit var model: NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        // Other code to setup the activity...

        // Get the ViewModel.
        model = ViewModelProviders.of(this).get(NameViewModel::class.java)


        // Create the observer which updates the UI.
        val nameObserver = Observer<String> { newName ->
            // Update the UI, in this case, a TextView.
            nameTextView.text = newName
        }

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        model.currentName.observe(this, nameObserver)

        button.setOnClickListener {
            val anotherName = "John Doe"
            model.currentName.setValue(anotherName)
        }
    }
}