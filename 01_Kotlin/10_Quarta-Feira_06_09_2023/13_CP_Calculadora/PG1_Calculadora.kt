
fun main() {
    // Solicita ao usuário que insira o primeiro número
    println("Digite o primeiro número:")
    val num1 = readLine()?.toDoubleOrNull() // Lê a entrada do usuário e tenta convertê-la em um número decimal

    // Solicita ao usuário que insira o operador (+, -, *, /)
    println("Digite o operador (+, -, *, /):")
    val operador = readLine() // Lê o operador inserido pelo usuário

    // Solicita ao usuário que insira o segundo número
    println("Digite o segundo número:")
    val num2 = readLine()?.toDoubleOrNull() // Lê a entrada do usuário e tenta convertê-la em um número decimal

    // Verifica se as entradas são inválidas
    if (num1 == null || operador.isNullOrEmpty() || num2 == null) {
        println("Entrada inválida.")
        return
    }

    // Realiza a operação com base no operador inserido
    val resultado = when (operador) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Não é possível dividir por zero.")
                return
            }
        }
        else -> {
            println("Operador inválido.")
            return
        }
    }

    // Exibe o resultado no console
    println("Resultado: $resultado")
}


