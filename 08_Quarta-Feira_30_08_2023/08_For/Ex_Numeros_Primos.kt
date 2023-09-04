fun main() {
    
    //
    val num = 6 //Altere o número 
    var isPrimo = true

    //Usando o loop for para verificar se o número é primo
    for (i in 2 until num) {
        if (num % i == 0) {
            isPrimo = false
            break 
        }
    }

    if (isPrimo) {
        println("O numero $num: é primo.")
    }else {
        println("O numero $num: não é primo")
    }
}