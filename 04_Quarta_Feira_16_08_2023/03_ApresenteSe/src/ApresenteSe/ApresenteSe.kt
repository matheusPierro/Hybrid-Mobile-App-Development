fun main() {

    // Declaração das variáveis
    var idade = 41 // Idade do indivíduo
    var altura = 1.67f // Altura do indivíduo (usando 'f' para indicar um float)
    var inicial = 'V' // Inicial do nome do indivíduo
    
    // Impressão das informações do indivíduo usando interpolação de strings
    println("Minha inicial é $inicial, tenho $idade anos e minha altura é %.2f".format(altura))
    
    // Declaração e inicialização de uma variável mutável
    var incremento = 5
    
    // Uso do operador de incremento pós-fixado
    incremento++ 
    // Agora, incremento é incrementado após sua utilização
    
    // Impressão do valor da variável incremento após a operação
    println(incremento)
}