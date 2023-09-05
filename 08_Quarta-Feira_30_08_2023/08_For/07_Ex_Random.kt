import kotlin.random.Random

//Ex: Geração de números aleatórios 
fun main() {
    // Gerando um número aleatório entre 1 e 50
    val numeroAleatorio = Random.nextInt(1, 50) // Gera números de 1 a 100

    // Verificando se o número é maior ou menor que 50
    if (numeroAleatorio > 50) {
        println("O número $numeroAleatorio é maior que 50.")
    } else {
        println("O número $numeroAleatorio é menor ou igual a 50.")
    }
}