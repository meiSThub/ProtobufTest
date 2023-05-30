package com.plum.protobuftest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.plum.proto.data.StudentOuterClass
import com.plum.proto.java.lib.WeatherOuterClass

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // android protobuf library module
        val student = StudentOuterClass.Student.newBuilder()
            .setName("张三")
            .setAge(18)
            .build()
        Log.i(TAG, "onCreate: student=$student")

        // java protobuf library module
        val weather = WeatherOuterClass.Weather.newBuilder()
            .setQuery(2)
            .setSeasonValue(30)
            .build()
        Log.i(TAG, "onCreate: student=$weather")
    }
}