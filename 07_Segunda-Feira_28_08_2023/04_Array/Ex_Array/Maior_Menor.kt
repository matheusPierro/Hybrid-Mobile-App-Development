// Exercicio 2: Array Maior e Menor Elemento de um Array
fun main() {

    // Array de inteiros
    val numbers = intArrayOf(8, 3, 12, 6, 20, 33, 58, 2)
    var min = numbers[0] // Variável  para armazenar o menor elemento
    var max = numbers[0] // Variável para armazenar o maior valor do elemento

    // loop para encontrar o menor e o maior elemento
    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }

    println("o menor elemento é: $min")
    println("o maior elemento é: $max")
}
