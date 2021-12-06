package natalia.example.myfirst

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView





class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.TextView)
        val upButton: Button = findViewById(R.id.buttonUp)
        val downButton: Button = findViewById(R.id.buttonDown)
        val leftButton: Button = findViewById(R.id.buttonLeft)
        val rightButton: Button = findViewById(R.id.buttonRight)

        upButton.setOnClickListener {
            textView.text = "Вверх"
        }

        textView.setOnClickListener {
            textView.text = "Press any button"
        }
        downButton.setOnClickListener {
            textView.text = "Вниз"
        }

        leftButton.setOnClickListener {
            textView.text = "Влево"
        }

        rightButton.setOnClickListener {
            textView.text = "Вправо"
        }
    }


}