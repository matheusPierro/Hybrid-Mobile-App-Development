// Desafio Prático - Calculadora de Média Escolar com [Input]

/*

Usar !! após readLine() é uma indicação de que o programador 
está afirmando que o resultado de readLine() nunca será nulo. 

Se readLine() de fato retornar null, o operador !!
forçará a lançar uma exceção NullPointerException. 

*/

fun main() {

    //Solicitando a primeira nota para o usuário
    println("Digite a nota da primeira prova:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a nota da segunda prova:")
    val nota2 = readLine()!!.toDouble()
    
    println("Digite a nota da terceira prova:")
    val nota3 = readLine()!!.toDouble()
    
    // Calculando a média escolar
    val media = (nota1 + nota2 + nota3) / 3

    // Imprimindo a média
    println("A média é: $media")

}

// Desafio Prático - Calculadora de Média Escolar

//Comentário em linha

/* Commentário em bloco. 
fun main() {
    //Declarando as médias escolares.
    val nota1 = 8.5
    val nota2 = 7.0
    val nota3 = 9.2

    //Calculando a média escolar
    val media = (nota1 + nota2 + nota3) / 3
    //val mediaFormatada = String.format("%.2f", media)
    println("A média é: $media")

    //Formatando média escolar.
    //println("A média é: $media ou médiaformatada $mediaFormatada")
}
*/
