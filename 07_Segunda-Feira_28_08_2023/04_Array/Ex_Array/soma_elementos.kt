//Exercicio1: Soma dos elementos
fun main() {

    //Array de inteiros 
    val numbers = intArrayOf(5,10,15,20,25)        // imutável 
    var sum = 0 //variável para armazenar a soma   // mutalvel 

    //loop para somar os elementos do array 

    for (number in numbers) {

            sum += number 
    }

    println("A soma dos elementos é: $sum")

}