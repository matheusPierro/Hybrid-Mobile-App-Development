//Exercício 3: Adivinhe o número

/*Criar um jogo simples de adivinhação. 
O programa deve gerar um número aleatório entre 1 e 100 e, 
em seguida, permitir que o usuário adivinhe até acertar.
O programa deve fornecer dicas se o número digitado for maior ou menor que o número secreto.
*/

import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 101) // Gera um número aleatório entre 1 e 100
    var tentativas = 0 // Inicializa o contador de tentativas
    var acertou = false // Inicializa a variável de controle do loop

    println("Tente adivinhar o número secreto entre 1 e 100.")

    while (!acertou) { // Enquanto o jogador não acertar o número
        println("Digite seu palpite:")
        val palpite = readLine()!!.toInt() // Solicita e lê o palpite do jogador
        tentativas++ // Incrementa o contador de tentativas

        when {
            palpite == numeroSecreto -> { // Se o palpite for igual ao número secreto
                acertou = true // Define a variável de controle como true para sair do loop
                println("Parabéns! Você acertou o número em $tentativas tentativas.")
            }
            palpite < numeroSecreto -> println("Tente um número maior.") // Dica: palpite é menor
            else -> println("Tente um número menor.") // Dica: palpite é maior
        }
    }
}


//Tratamento campo vazio

/*

import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 101)
    var tentativas = 0
    var acertou = false

    println("Tente adivinhar o número secreto entre 1 e 100.")

    while (!acertou) {
        println("Digite seu palpite:")
        val input = readLine()

        if (input != null && input.isNotEmpty()) {
            val palpite = input.toInt()
            tentativas++

            when {
                palpite == numeroSecreto -> {
                    acertou = true
                    println("Parabéns! Você acertou o número em $tentativas tentativas.")
                }
                palpite < numeroSecreto -> println("Tente um número maior.")
                else -> println("Tente um número menor.")
            }
        } else {
            println("Entrada inválida.")
        }
    }
}


*/