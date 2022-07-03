package com.example.fibonnaciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fibonnaciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        getFibbonacci()
    }
    fun castNumbers () {

    }
    fun getFibbonacci() {
        var i = 1
        val n = 100
        var a = 0
        var b = 1

        print("First $n terms: ")

        while (i <= n) {
            print("$a + ")

            val sum = a+ b
            a = b
            b = sum

            i++
        }
    }
}