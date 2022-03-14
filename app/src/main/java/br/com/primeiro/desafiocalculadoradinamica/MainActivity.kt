package br.com.primeiro.desafiocalculadoradinamica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etValue1: EditText = findViewById(R.id.etValue1)
        val etValue2: EditText = findViewById(R.id.etValue2)
        val tvResult: TextView = findViewById(R.id.tvResult)

        val btPlus: Button = findViewById(R.id.btPlus)
        val btMinus: Button = findViewById(R.id.btMinus)
        val btDivide: Button = findViewById(R.id.btDivide)
        val btMultiply: Button = findViewById(R.id.btMultiply)

        btPlus.setOnClickListener{
            tvResult.setText(plus(etValue1.text.toString().toFloat(),etValue2.text.toString().toFloat()).toString());
        }

        btMinus.setOnClickListener{
            tvResult.setText(minus(etValue1.text.toString().toFloat(),etValue2.text.toString().toFloat()).toString());
        }

        btDivide.setOnClickListener{
            tvResult.setText(divide(etValue1.text.toString().toFloat(),etValue2.text.toString().toFloat()).toString());
        }

        btMultiply.setOnClickListener{
            tvResult.setText(multiply(etValue1.text.toString().toFloat(),etValue2.text.toString().toFloat()).toString());
        }


    }
    fun plus(a: Float, b: Float): Float{
        return a + b
    }
    fun minus(a: Float, b: Float): Float{
        return a - b
    }
    fun divide(a: Float, b: Float): Float{
        return a / b
    }
    fun multiply(a: Float, b: Float): Float{
        return a * b
    }

}