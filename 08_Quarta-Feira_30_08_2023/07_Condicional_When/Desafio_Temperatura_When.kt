fun classificarClima(temperatura: Int) {
    val clima = when {
        temperatura < 10 -> "Frio"
        temperatura in 10..25 -> "Moderado"
        else -> "Quente"
    }
    println("O clima está classificado como: $clima")
}

fun main() {
    val temperatura = 18
    classificarClima(temperatura)
}


/* 

// Função para classificar o clima com base na temperatura
fun classificarClima(temperatura: Int) {
    val clima = when {
        temperatura < 10 -> "Frio"
        temperatura in 10..25 -> "Moderado"
        else -> "Quente"
    }
    println("O clima está classificado como: $clima")
}

fun main() {
    // Solicita ao usuário que insira a temperatura
    println("Digite a temperatura: ")
    
    // Lê a entrada do usuário como uma string
    val temperaturaStr = readLine()
    
    // Verifica se a entrada não é nula
    if (temperaturaStr != null) {
        // Tenta converter a string para um valor inteiro
        val temperatura = temperaturaStr.toIntOrNull()
        
        // Verifica se a conversão foi bem-sucedida
        if (temperatura != null) {
            // Chama a função para classificar o clima com a temperatura fornecida
            classificarClima(temperatura)
        } else {
            // Mensagem exibida se a entrada não pôde ser convertida para um número
            println("Temperatura inválida. Certifique-se de inserir um valor numérico.")
        }
    } else {
        // Mensagem exibida se a entrada do usuário foi nula
        println("Entrada inválida.")
    }
}

*/