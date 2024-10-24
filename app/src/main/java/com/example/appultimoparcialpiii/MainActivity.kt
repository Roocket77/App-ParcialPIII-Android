package com.example.appultimoparcialpiii


import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appultimoparcialpiii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnCalcularSueldo.setOnClickListener(this)

    }
    private fun irACalculador(){
        val intent = Intent(this, CalculadorActivity::class.java)
        intent.putExtra("name", binding.etxNombre.text.toString()) // Convertido a String
        startActivity(intent)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btnCalcularSueldo -> irACalculador()
        }
    }



}