package natalia.example.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
const val TAG = "Poem"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Как бестолковы числа эти...")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Какой сумбур в календаре!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Теперь зима уж на дворе,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"А мне вот довелось во всем ее расцвете,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"В ее прелестнейшей поре,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Приветствовать Весну лишь в позднем ноябре.")
    }
}