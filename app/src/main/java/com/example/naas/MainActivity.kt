package com.example.naas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.naas.api.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var reasonTextView: TextView
    private lateinit var generateBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        reasonTextView = findViewById(R.id.reasonTextView)
        generateBtn = findViewById(R.id.generateBtn)

        // Preload / warm up API to reduce first-click delay
        CoroutineScope(Dispatchers.IO).launch {
            try {
                RetrofitInstance.api.getReason()
            } catch (e: Exception) {
                // ignore errors
            }
        }

        generateBtn.setOnClickListener {
            fetchReason()
        }
    }

    private fun fetchReason() {
        reasonTextView.text = "Loading..."

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = RetrofitInstance.api.getReason()
                withContext(Dispatchers.Main) {
                    reasonTextView.text = response.reason
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    reasonTextView.text = "Error: ${e.message}"
                }
            }
        }
    }
}
