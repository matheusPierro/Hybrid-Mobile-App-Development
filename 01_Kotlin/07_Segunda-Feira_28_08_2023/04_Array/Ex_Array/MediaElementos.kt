//Exercicio 3 - Media de elementos

fun main() {

    //Array de doubles 
    var values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0)
    var soma = 0.0 // Variável para armazenar a soma

    // Loop para somar os elementos do array
    for (value in values)  {
        soma += value
    }
    
    val media =  soma / values.size // calculo da media 
    print("A média dos elementos é: $media") 

}