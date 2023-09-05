fun main() {
    // Exercício 1: Imprimir números de 1 a 10
    for (i in 1..10) {
        println(i)
    }
    
    // Exercício 2: Calcular a soma de números de 1 a n (fornecido pelo usuário)
    print("Digite um número: ")
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("A soma dos números de 1 a $n é: $sum")
    
    // Exercício 3: Imprimir os números pares de 1 a n (fornecido pelo usuário)
    print("Digite um número: ")
    val n2 = readLine()!!.toInt()
    println("Números pares de 1 a $n2:")
    for (i in 2..n2 step 2) {
        println(i)
    }
    
    // Exercício 4: Verificar se um número é primo (fornecido pelo usuário)
    print("Digite um número: ")
    val num = readLine()!!.toInt()
    var isPrime = true
    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    if (isPrime) {
        println("$num é um número primo.")
    } else {
        println("$num não é um número primo.")
    }
}
