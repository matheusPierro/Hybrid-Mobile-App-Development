//Exercício 1: Contagem regressiva
//O objetivo deste exercício é criar um programa que solicita um número inteiro positivo e, em seguida, exibe uma contagem regressiva a partir desse número até 1.

fun main() {
    println("Digite um número inteiro positivo:")
    val numero = readLine()!!.toInt() // Solicita e lê o número fornecido pelo usuário

    var contador = numero // Inicializa o contador com o número fornecido
    while (contador >= 1) { // Enquanto o contador for maior ou igual a 1
        println(contador) // Imprime o valor atual do contador
        contador-- // Decrementa o contador em 1 a cada iteração
    }
}


/*

Tratamento de campo vazio
fun main() {
    println("Digite um número inteiro positivo:")
    val input = readLine()
    
    if (input != null && input.isNotEmpty()) {
        val numero = input.toInt()
        
        var contador = numero
        while (contador >= 1) {
            println(contador)
            contador--
        }
    } else {
        println("Entrada inválida.")
    }
}

*/