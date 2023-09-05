//Desafio Prático  - Potência. 
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
        // Incrementa o valor do expoente para a próxima iteração
        expoente++
        
        // Calcula a potência de 2 elevado ao expoente atual
        potencia = 1
        repeat(expoente) {
            potencia *= 2
        }
    }
    
    // Exibe a primeira potência de 2 maior que o valor inserido no formato desejado
    println("Se usuário inserir $valorInserido(20) como valor, o programa calculará 2 elevado a $expoente (2^$expoente) que é igual a $potencia. Portanto, a saída será: \"A primeira potência de 2 maior que $valorInserido é 2^$expoente = $potencia\".")

    //Por exemplo, se o usuário inserir 20 como valor, o programa calculará 2 elevado a 5 (2^5) que é igual a 32. 
    //Portanto, a saída será: "A primeira potência de 2 maior que 20 é 2^5 = 32".
    
}

/*
Explicação do desafio com base na matématica ;-) 

O usuário insere o valor 20 o programa começa com a potência de 2 igual a 1 (pois 2 elevado a 0 é igual a 1).
Então o programa entra em um loop que se repete até que a potência de 2 seja maior do que o valor inserido (20).
Dentro do loop, a potência de 2 é dobrada em cada iteração. 

Ou seja, multiplicamos a potência de 2 por 2 em cada passo do loop.

[
Primeira iteração:  Potência de 2 = 1 * 2 = 2.
Segunda iteração:   Potência de 2 = 2 * 2 = 4.
Terceira iteração:  Potência de 2 = 4 * 2 = 8.
Quarta iteração:    Potência de 2 = 8 * 2 = 16.
Quinta iteração:    Potência de 2 = 16 * 2 = 32.
]

Agora, após a quinta iteração, a potência de 2 (32) é maior do que o valor inserido (20). O loop ou programa para de executar. 

O programa exibe a primeira potência de 2 (32) que é maior que o valor inserido (20) como resultado.

Portanto, matematicamente, o programa está encontrando a primeira potência de 2 que é maior do que o valor inserido pelo usuário, 
realizando sucessivas multiplicações por 2 até que essa condição seja atendida.
*/