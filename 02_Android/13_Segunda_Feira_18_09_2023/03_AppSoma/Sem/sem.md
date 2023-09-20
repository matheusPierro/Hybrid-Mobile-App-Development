```kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// Classe principal da atividade, que herda da AppCompatActivity
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button // Declaração da variável para o botão
    private lateinit var textViewOutput: TextView // Declaração da variável para o TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout da atividade a partir do arquivo XML "activity_main.xml"

        // Inicializa as visualizações manualmente usando findViewById
        button = findViewById(R.id.button) // Encontra o botão no layout pelo seu ID
        textViewOutput = findViewById(R.id.textViewOutput) // Encontra o TextView no layout pelo seu ID

        // Define o que acontece quando o botão é clicado
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val message = "Olá, sem Kotlin Android Extensions!" // Cria uma mensagem de texto
                textViewOutput.text = message // Define o texto do TextView como a mensagem
                Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show() // Exibe um Toast com a mensagem
            }
        })
    }
}

```
import: Importa as classes e recursos necessários para a atividade.
class MainActivity : AppCompatActivity(): Declara a classe MainActivity que herda da classe AppCompatActivity, que é a base para atividades Android modernas.
private lateinit var button: Button e private lateinit var textViewOutput: TextView: Declara duas variáveis para representar o botão e o TextView no layout.
onCreate: Este é um método de ciclo de vida da atividade que é chamado quando a atividade é criada.
setContentView(R.layout.activity_main): Define o layout da atividade a partir do arquivo XML "activity_main.xml".
button = findViewById(R.id.button) e textViewOutput = findViewById(R.id.textViewOutput): Inicializa as visualizações manualmente encontrando-as pelo ID.
button.setOnClickListener(...): Define o que acontece quando o botão é clicado. Neste caso, ele define o texto do TextView como "Olá, sem Kotlin Android Extensions!" e exibe uma mensagem Toast com essa mensagem.