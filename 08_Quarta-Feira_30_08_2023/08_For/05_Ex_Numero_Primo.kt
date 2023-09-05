//Exemplo números primos 
fun main() {
    val numero = 17 // Altere o valor de num conforme necessário
    var ePrimo = true

    // Usando o loop for para verificar se um número é primo
    for (i in 2 until numero) {
        if (numero % i == 0) {
            ePrimo = false
            break
        }
    }

    if (ePrimo) { // é primo?
        println("$numero é primo.")
    } else {      // se não é primo?
        println("$numero não é primo.")
    }
}
