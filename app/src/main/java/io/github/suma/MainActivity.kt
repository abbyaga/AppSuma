package io.github.suma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1: EditText = findViewById(R.id.num1)
        val n2: EditText = findViewById(R.id.num2)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener { view -> Snackbar.make(
                view,
                "Respuesta: " + (n1.text.toString().toInt()+n2.text.toString().toInt()),
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}