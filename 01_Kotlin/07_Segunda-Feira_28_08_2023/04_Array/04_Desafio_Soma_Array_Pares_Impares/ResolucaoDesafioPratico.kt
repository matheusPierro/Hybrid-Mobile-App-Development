fun main() {

    // Declarando os arrays pares e impares
    val pares = intArrayOf(0, 2, 4, 6) // Criando um array com numeros pares
    val impares = intArrayOf(1, 3, 5, 7) // Criando um array com numeros impares
    val soma = IntArray(4) // Criando um array para armazenar a soma de pares e impares

    // Atribuiando valores pares e impares para o array soma

    soma[0] = pares[0] + impares[0] // Atribuindo a soma do primeiro par e Ímpar
    soma[1] = pares[1] + impares[1] // Atribuindo a soma do segundo par e Ímpar
    soma[2] = pares[2] + impares[2] // Atribuindo a soma da terceiro par e Ímpar
    soma[3] = pares[3] + impares[3] // Atribuindo a soma do quarto par e Ímpar

    //Exibiçao dos valores do array soma
    println("Registro 0 de soma[0] é ${soma[0]}")   // Imprimindo a soma do primeiro par e ímpar
    println("Registro 1 de soma[0] é ${soma[1]}")   // Imprimindo a soma do segundo par e ímpar
    println("Registro 2 de soma[0] é ${soma[2]}")   // Imprimindo a soma do terceira par e ímpar
    println("Registro 3 de soma[0] é ${soma[3]}")   // Imprimindo a soma do quarta  e ímpar
}
