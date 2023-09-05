fun main() {
    // Solicita ao usuário que insira um valor
    println("Digite um valor: ")
    
    // Lê a entrada do usuário como uma string e a converte para um valor inteiro.
    // Se a conversão falhar, o valor padrão 0 é usado.
    val valorInserido = readLine()?.toInt() ?: 0
    
    // Inicializa a potência como 1 e o expoente como 0
    var potencia = 1
    var expoente = 0
    
    // Enquanto a potência for menor ou igual ao valor inserido pelo usuário
    while (potencia <= valorInserido) {
        // Calcula a potência de 2 elevado ao expoente atual usando a função Math.pow().
        // O resultado é convertido de double para int.
        potencia = Math.pow(2.0, expoente.toDouble()).toInt()
        
        // Incrementa o valor do expoente para a próxima iteração
        expoente++
    }
    
    // Exibe a primeira potência de 2 maior que o valor inserido.
    println("A primeira potência de 2 maior que $valorInserido é 2^$expoente = $potencia")
}


// Neste programa, o usuário insere um valor e o programa utiliza um loop `while` 
// para calcular potências de 2 até encontrar a primeira potência que seja maior do que o valor inserido.
// O programa exibirá a potência encontrada e o expoente correspondente.