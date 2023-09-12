// Define uma função chamada 'somaDosQuadrados' que recebe dois parâmetros inteiros 'a' e 'b'
fun somaDosQuadrados(a: Int, b: Int): Int {
    // Calcula o quadrado de 'a' e armazena o resultado na variável 'quadradoA'
    val quadradoA = a * a
    // Calcula o quadrado de 'b' e armazena o resultado na variável 'quadradoB'
    val quadradoB = b * b
    // Retorna a soma dos quadrados de 'a' e 'b'
    return quadradoA + quadradoB
}

// Função principal
fun main() {
    // Declaração da variável 'numero1' com o valor 3
    val numero1 = 3
    // Declaração da variável 'numero2' com o valor 5
    val numero2 = 5
    // Chama a função 'somaDosQuadrados' com os valores de 'numero1' e 'numero2'
    // e armazena o resultado na variável 'resultado'
    val resultado = somaDosQuadrados(numero1, numero2)
    // Imprime uma mensagem com os valores de 'numero1', 'numero2' e 'resultado'
    println("A soma dos quadrados de $numero1 e $numero2 é: $resultado")
}
