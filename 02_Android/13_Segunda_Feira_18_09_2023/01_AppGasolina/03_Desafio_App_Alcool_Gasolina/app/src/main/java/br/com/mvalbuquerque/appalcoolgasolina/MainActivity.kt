package br.com.mvalbuquerque.appalcoolgasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

// Classe principal da atividade, que herda da AppCompatActivity
class MainActivity : AppCompatActivity() {
    // Função chamada quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade apartir do arquivo XML "activity_main.xml"
        setContentView(R.layout.activity_main)
    }

    //Função chamada quando o botão de cálculo é clicado
    fun calculate(view: View){
        // Encontrando os campos de entrada da informação alcool e gasolina no layout
        val editTextAlchool = findViewById<EditText>(R.id.editTextAlcohol)
        val editTextGasoline = findViewById<EditText>(R.id.editTextGasoline)

        // Obtém o texto dos campos de entrada.
        val alcoholInput = editTextAlchool.text.toString()
        val gasolineInput = editTextGasoline.text.toString()

        //Verifica se os campos estão vazios
        if (alcoholInput.isEmpty() || gasolineInput.isEmpty()) {
            // Se um ou ambos os campos estiverem vazios, exibe um Toast informe ao usuário
            Toast.makeText(this, "Por favor, preencha ambos os campos", Toast.LENGTH_SHORT).show()
            return // sair da função para evitar  calcuos invalidos
        }
        //Converter o texto dos campos em valores numéricos (preços)
        val alcoholPrice = alcoholInput.toDoubleOrNull()
        val gasolinePrice = gasolineInput.toDoubleOrNull()

        // Verifica os valores inseridos são válidos (não nulos)
        if (alcoholPrice != null && gasolinePrice != null) {

            //Calcula se o acool é vantajoso em relação a gasolina
            val result = if (alcoholPrice / gasolinePrice < 0.7) {
                "Alcool é vantajoso" } else
            {
                "Gasolina é vantajosa"
            }

            //Criar uma intenção para abrir a ResultActivity e passa o resultado como extra
            val intent = Intent( this, ResultActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        }
    }
}



