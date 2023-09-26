package br.com.mvalbuquerque.appapresentese

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialize as variáveis com os elementos da interface
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {

            //Primeira Forma
            val msg = "Oi, ${editText.text}"
//            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            //Segunda Forma
            //   val textoDigitado = editText.text.toString()
//            if (textoDigitado.isEmpty()) {
//                Toast.makeText(this, "Preencha o campo Nome.", Toast.LENGTH_SHORT).show()
//            } else {
//                textView.text = textoDigitado
//            }
          //Terceira Forma
           showInfoDialog("Bem Vindo(a)!", msg)

        }

    }
    //Terceira forma
    fun showInfoDialog(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("ok", null)
        builder.create().show()
    }
}