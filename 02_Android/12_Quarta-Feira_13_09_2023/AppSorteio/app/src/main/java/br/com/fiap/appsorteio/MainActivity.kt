package br.com.fiap.appsorteio

// Importar as bibliotecas necessárias
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.util.Random


// Define a classe MainActivity que estende AppCompatActivity
class MainActivity : AppCompatActivity() {

    // O método onCreate é chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade com o arquivo XML activity_main.xml
        setContentView(R.layout.activity_main)
        Log.i("Btn","Um número foi sorteado")
    }

    // Esta é a função que será chamada quando o botão for clicado
    fun sortearNumero(view: View) {
        // Encontra o TextView com o ID textoResultado no layout
        val texto = findViewById<TextView>(R.id.textoResultado)

        // Gera um número aleatório entre 0 e 10 (inclusive)
        val numero = Random().nextInt(11)

        // Define o texto do TextView para mostrar o número sorteado
        texto.text = "Número: $numero"
    }
}
