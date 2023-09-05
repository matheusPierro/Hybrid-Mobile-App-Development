//Exercicio  - Pré e Pós Incremento
fun main() {
    println("Pré-incremento e Pós-incremento\n")

    var contador = 5

    println("Valor inicial do contador: $contador")

    // Pré-incremento: Incrementa a variável e depois a utiliza
    val resultadoPreIncremento = ++contador
    println("Após pré-incremento, contador = $contador e resultado = $resultadoPreIncremento")

    contador = 5 // Resetamos o contador

    // Pós-incremento: Utiliza a variável e depois a incrementa
    val resultadoPosIncremento = contador++
    println("Após pós-incremento, contador = $contador e resultado = $resultadoPosIncremento")

    // Pré-incremento é igual a:
    // contador = contador + 1
    // resultadoPreIncremento = contador
    // Pós-incremento é igual a:
    // resultadoPosIncremento = contador
    // contador = contador + 1
}
///=====considerar o exemplo acima ====

// fun main() {
//     println("Inicio do programa\n")

//     var numero = 10

//     println("variável: $numero")

//     println("variável++: ${numero++}")

//     println("variável: $numero")

//     println("++variável: ${++numero}")

//     // O número 12 subtraído 1 é: 11
//     println("O número $numero subtraído 1 é: $numero")

//     // Pré-incremento: incremento VARIÁVEL
//     // Pós-incremento: VARIÁVEL decremento
// }



