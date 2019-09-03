package com.dnights.livedatasample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    val temp: MutableLiveData<String> = MutableLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        temp.observe(this, Observer {
            println("$it")
        })

        funtion1()
    }

    fun funtion1 () {
        temp.value = "1234"
        temp.postValue("5678")
    }
}
