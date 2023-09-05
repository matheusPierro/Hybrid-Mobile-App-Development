//Exercício 2: Soma dos múltiplos de 3
//Criar um programa que solicita um número inteiro positivo e calcula a soma de todos os múltiplos de 3 que sejam menores ou iguais ao número fornecido.


fun main() {
    println("Digite um número inteiro positivo:")
    val numero = readLine()!!.toInt() // Solicita e lê o número fornecido pelo usuário

    var soma = 0 // Inicializa a variável de soma
    var contador = 3 // Inicializa o contador com o primeiro múltiplo de 3
    while (contador <= numero) { // Enquanto o contador for menor ou igual ao número fornecido
        soma += contador // Adiciona o valor do contador à soma
        contador += 3 // Incrementa o contador em 3 para obter o próximo múltiplo de 3
    }
    println("A soma dos múltiplos de 3 até $numero é: $soma") // Imprime o resultado
}


//Tratamento de campo vazio
/*
fun main() {
    println("Digite um número inteiro positivo:")
    val input = readLine()
    
    if (input != null && input.isNotEmpty()) {
        val numero = input.toInt()
        
        var soma = 0
        var contador = 3
        while (contador <= numero) {
            soma += contador
            contador += 3
        }
        println("A soma dos múltiplos de 3 até $numero é: $soma")
    } else {
        println("Entrada inválida.")
    }
}


*/