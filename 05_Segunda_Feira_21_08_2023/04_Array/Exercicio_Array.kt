fun main() {
    // Trabalhando com Arrays (Vetores, Matrizes, Coleções, Listas)
    // Tipo de dado que permite armazenar múltiplos valores em uma mesma variável
    // Observação: O acesso dos elementos do Array é feito através de um índice que começa em ZERO

    // Declaração de um Array
    // var nomeDaVariavel = arrayOf(valor, valor, valor)
    val idades = arrayOf(27, 32, 26)
    // Acesso a uma posição específica do array
    println("O registro ZERO de idades é: ${idades[0]}")

    val alturas = FloatArray(256)

    // Outra forma de declaração e atribuição de valores a um Array
    alturas[0] = 1.71f
    alturas[1] = 1.62f
    alturas[2] = 1.53f
    alturas[3] = 1.84f
    alturas[4] = 1.92f

    // Imprimindo o valor do primeiro registro de altura
    println("O registro UM de alturas é: %.2f".format(alturas[1]))

    // Outra forma de declaração de atribuição de valor de um Array
    val nome = charArrayOf('Q', 'U', 'A', 'D', 'D', 'R', 'O')
    println("O último caractere de nome é: ${nome[6]}")

    // Trocar para 20
    val empresa = "FIAP"
    println("Nome da Empresa é: ${empresa[0]}")

    var tamanho: Int
    tamanho = nome.size
    println("Tamanho do último caractere de nome é: ${nome[tamanho - 1]}")

    // Como em Kotlin não existe um método direto para retornar o tamanho de um array,
    // utilizamos a propriedade size do array.
    println("Quantidade de ítens: ${idades.size}")

    println("Peso do array: ${idades.size * 4} bytes") // Um Int possui 4 bytes de tamanho
    println("Peso de um Int: 4 bytes")
    println("Quantidade de ítens: ${idades.size}")

    // Para mostrar o tamanho em bytes de outros tipos, basta multiplicar o tamanho do item pelo tamanho do tipo.
    // Exemplo: Para um FloatArray, o tamanho de cada item é 4 bytes.
    // Portanto, o tamanho total em bytes do array é FloatArray.size * 4.
}