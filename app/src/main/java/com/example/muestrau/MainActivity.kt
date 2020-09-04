package com.example.muestrau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class USketcher {
        fun draw() {
            val rows = 5;
            val cols = 5;
            for (row in 0 until rows) {
                println("*")
                if (row == rows - 1) {
                    for (col in 0 until cols) {
                        print("* ")
                    }
                }
            }
        }
        private fun print(text: String) {
            print(text)
        }

        private fun println(text: String) {
            println(text)
        }
    }
}