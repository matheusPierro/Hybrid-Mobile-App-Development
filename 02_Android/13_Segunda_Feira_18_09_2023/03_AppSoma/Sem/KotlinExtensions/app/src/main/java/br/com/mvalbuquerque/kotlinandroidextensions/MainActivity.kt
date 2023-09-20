package br.com.mvalbuquerque.kotlinandroidextensions

//Sem utilização do kotlin extencions 
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textViewOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa as visualizações manualmente
        button = findViewById(R.id.button)
        textViewOutput = findViewById(R.id.textViewOutput)

        // Define o que acontece quando o botão é clicado
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val message = "Olá, sem Kotlin Android Extensions!"
                textViewOutput.text = message
                Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
