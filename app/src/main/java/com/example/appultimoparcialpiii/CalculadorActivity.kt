package com.example.appultimoparcialpiii

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.appultimoparcialpiii.databinding.ActivityCalculadorSueldosBinding

class CalculadorActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityCalculadorSueldosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadorSueldosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnCalcular.setOnClickListener(this)
        getName()

    }
    private fun sueldo() {
        val pagoPorHora = binding.etxPagoXHora.text.toString().toBigDecimalOrNull()
        val horasTrabajadas = binding.etxHorasTrabajadas.text.toString().toBigDecimalOrNull()

        if (pagoPorHora != null && horasTrabajadas != null) {
            val result = pagoPorHora * horasTrabajadas
            val name = binding.txtName.text.toString()
            binding.txtResultado.text = "$name, tu sueldo es $$result"
        } else {
            binding.txtResultado.text = "Por favor, ingresa valores válidos."
        }
    }

    override fun onClick(v: View?) {
       when(v!!.id){
           R.id.btnCalcular -> sueldo()
       }
    }
     private fun getName(){
        val data = intent.extras?.getString("name")

         binding.txtName.text = data
    }

}


