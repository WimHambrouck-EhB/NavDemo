package org.hambrouck.navdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.hambrouck.navdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val secondActivityIntent = Intent(this, SecondActivity::class.java)


        binding.txtHello.text = getString(R.string.some_text)

        binding.btnNavigate.setOnClickListener {
            secondActivityIntent.putExtra("name", binding.edtFirstname.text.toString())
            startActivity(secondActivityIntent)
        }

    }

    fun updateUI() {
        binding.txtHello.text = getString(R.string.updated)
    }

}