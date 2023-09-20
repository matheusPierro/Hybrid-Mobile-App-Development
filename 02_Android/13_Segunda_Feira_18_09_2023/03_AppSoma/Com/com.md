```kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // Define o que acontece quando o botão é clicado
        button.setOnClickListener {
            val message = "Olá, Kotlin Android Extensions!"
            textViewOutput.text = message
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
```

```Shell 
//https://medium.com/kotlin-para-android/kotlin-android-extensions-8abdc33f21ef
```
