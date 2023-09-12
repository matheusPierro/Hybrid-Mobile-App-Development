// Função principal onde o programa começa a executar
fun main() {
    // Definindo variáveis de diferentes tipos
    val valChar: Char = ' '
    val valInt: Int = 0
    val valFloat: Float = 0.0f
    val valLong: Long = 0L
    
    // Imprimindo cabeçalho da tabela
    println("-- Tabela de Tipos de Dados --")
    
    // Chamando a função para imprimir o tamanho em bytes de cada tipo de dado
    println("char  | ${calcSizeInBytes(valChar)} bytes")
    println("int   | ${calcSizeInBytes(valInt)} bytes")
    println("float | ${calcSizeInBytes(valFloat)} bytes")
    println("long  | ${calcSizeInBytes(valLong)} bytes")
}
// Função para calcular o tamanho em bytes de um tipo de dado
fun calcSizeInBytes(value: Any): Int {
    // Utilizando uma expressão "when" para determinar o tamanho de acordo com o tipo
    val bits = when (value) {
        is Char -> 16   // Char utiliza 16 bits em Kotlin
        is Int -> 32    // Int utiliza 32 bits em Kotlin
        is Float -> 32  // Float utiliza 32 bits em Kotlin
        is Long -> 64   // Long utiliza 64 bits em Kotlin
        else -> throw IllegalArgumentException("Tipo de dado não suportado")
    }
    
    // Convertendo os bits para bytes e retornando o valor
    return bits / 8
}
