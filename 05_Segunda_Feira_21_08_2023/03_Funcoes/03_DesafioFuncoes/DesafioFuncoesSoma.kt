// Definindo uma função chamada 'somaDosQuadrados' que recebe dois parametros inteiros 'a' e 'b'
fun somaDosQuadrados(a: Int, b: Int): Int {

    // Calcula o quadrado de 'a' e armazena o resultado na variável 'quadradoA'
    val quadradoA = a * a 

    // Calacula o quadrado de 'b' e armazena o resultado na variável 'quadradoB'
    val quadradoB = b * b

    // Retorna a soma dos quadrados de 'a' e 'b' 
    return quadradoA + quadradoB

}

fun main() {

    // val recebe o valor declarado na variável 'numero1' como 3. 
    val numero1 = 3

    // val recebe o valor declarado na variável 'numero2' como 5. 
    val numero2 = 5

    //Chama a função `somadosQuadrados` com os valores n1, n2 armazena o resultado na variável resultado
    val resultado = somaDosQuadrados(numero1, numero2)

    println("A soma dos quadrados de $numero1 e $numero2 é: $resultado")



}

