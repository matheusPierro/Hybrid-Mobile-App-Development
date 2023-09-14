import kotlin.random.Random

fun realizarSorteioMegaSena() {
    println("Bem-vindo(a) à Simulação da Mega Sena!")

    val numerosSorteados = mutableListOf<Int>() // Lista para armazenar os números sorteados

    val random = Random.Default // Objeto para gerar números aleatórios

    while (numerosSorteados.size < 6) {
        val numeroSorteado = random.nextInt(1, 61) // Gera um número aleatório no intervalo [1, 60]
        numerosSorteados.add(numeroSorteado)       // Adiciona o número à lista
    }

    val numerosOrdenados = numerosSorteados.sorted() // Ordena os números sorteados em ordem crescente

    println("Números sorteados: ${numerosOrdenados.joinToString(", ")}") // Exibe os números sorteados
}

fun main() {
    realizarSorteioMegaSena() // executa a função acima. 
}
