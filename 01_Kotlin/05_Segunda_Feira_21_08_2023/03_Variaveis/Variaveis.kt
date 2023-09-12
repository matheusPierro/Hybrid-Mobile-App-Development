

// fun main() {
//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 10000000000
//     val numeroDecimal: Double = 3.14
//     val caractere: Char = 'A'
//     val texto: String = "Kotlin é incrível!"
//     val verdadeiro: Boolean = true
//     println("Número Inteiro: $numeroInteiro")
//     println("Número Long: $numeroLong")
//     println("Número Decimal: $numeroDecimal")
//     println("Caractere: $caractere")
//     println("Texto: $texto")
//     println("Valor Booleano: $verdadeiro")
// }


// // // Exemplos de mutabilidade e imutabilidade
// fun main() {

//     //Declaração de variaveis
//     val imutavel: Int = A  // declarando variável  [imutavel]  [ A ]
//     var mutavel:  Int = 10  // declarando variável  [mutável]
   
//     // Quero que troque para 15 pois é uma variável mutal.
//     // mutavel = 15 // OK
  
//     //imutavel = 8 // Erro! Não é permitido reatribuir valor a uma variável imutável
//     println("Valor da variável mutavel: $mutavel")
//     println("Valor da variável imutavel: $imutavel")
// }

// fun main() {

//     //Declaração de variaveis
//     val nome: String =  "Vinny"
//     val apelido: Char =  "V"
//     val idade: Int =  1
//     val sexo: Boolean =  true

//     println("Valor da variável camponome: $camponome")
//
// }
// Exemplos de nomenclatura de variáveis
// fun main() {
//     val nomeCompleto: String = "João Silva"
//     val idadeUsuario: Int = 30
//     val valorTotal: Double = 50.0 // Evite usar underscores em nomes de variáveis
//     println("Nome Completo: $nomeCompleto")
//     println("Idade do Usuário: $idadeUsuario")
//     println("Valor Total: $valorTotal")
// }


// Exemplo de escopo de variáveis
fun main() {
    val nome = "Alice"
    if (true) {
        val sobrenome = "Silva" // Variável sobrenome só é visível dentro deste bloco
        println("$nome $sobrenome") // Alice Silva
    }
    // println("$nome $sobrenome") // Erro! Variável sobrenome não é visível aqui
}