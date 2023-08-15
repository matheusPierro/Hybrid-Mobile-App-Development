---
marp: true
theme: default
class: invert
---

## Declaração da função 

```kotlin

//Aqui, começamos definindo a função principal do programa. Em Kotlin, fun é usado para declarar uma função.
fun main() {

//Esta linha imprime a string "Olá Mundo" no console. O println() é uma função embutida que exibe uma linha de texto seguida por uma nova linha.
println("Olá Mundo")

//Aqui, outra linha é impressa no console, desta vez exibindo a string "Nova Mensagem".
println("Nova Mensagem")
}

---
//O fechamento da função main(). Marca o fim do bloco de código da função principal.

//No geral, o programa é simples. Ele declara uma função main, que é o ponto de entrada do programa. Dentro dessa função, duas mensagens são impressas no console, uma após a outra. A saída no console seria:
```
---

**Desafio Kotlin**

Crie um aplicativo simples em Kotlin que exiba arquivos "OlaMundo".

Em seu editor favorito, crie um novo arquivo chamado OlaMundo.kt com as seguintes linhas:

Compile o aplicativo usando o compilador Kotlin

 ```Terminal
  kotlinc olamundo.kt -include-runtime -d olamundo.jar
 ```

**Execute o aplicativo**

 ```Terminal
 java -jar olamundo.jar    
 ```



Link Documentação: https://kotlinlang.org/docs/command-line.html#create-and-run-an-application

 