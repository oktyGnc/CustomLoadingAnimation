package com.oktaygenc.customloadinganimation

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loadingDialog: CustomLoadingDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadingDialog = CustomLoadingDialog(this)

        val button: Button = findViewById(R.id.startButton)
        button.setOnClickListener {
            loadingDialog.show("Veri Yükleniyor...")
            simulateLongTask()
        }
    }

    private fun simulateLongTask() {
        Handler().postDelayed({
            loadingDialog.dismiss()
            Toast.makeText(this, "İşlem Tamamlandı", Toast.LENGTH_SHORT).show()
        }, 3000)
    }
}