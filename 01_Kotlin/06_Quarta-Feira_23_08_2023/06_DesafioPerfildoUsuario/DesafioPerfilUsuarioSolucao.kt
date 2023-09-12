// Desafio Perfil Usuario  - Com Input

// para mac indentação opt+shif+f


/*

Usar !! após readLine() é uma indicação de que o programador 
está afirmando que o resultado de readLine() nunca será nulo. 

Se readLine() de fato retornar null, o operador !!
forçará a lançar uma exceção NullPointerException. 

*/

fun main() {

    // Solicitando entrada dos dados do usuario
    println("Digite seu nome:")
    val nome = readLine()!!

    println("Digite seu idade:")
    val idade = readLine()!!.toInt()

    println("Digite seu email:")
    val email = readLine()!!

    println("O usuário está ativo?(true/false):")
    val usuarioAtivo = readLine()!!.toBoolean()

    // Exibição das informações no console
    println("Nome: $nome")
    println("Idade: $idade")
    println("Email: $email")
    print("Ativo: $usuarioAtivo")
}

// fun main() {
//     // Declaração e atribuição de variáveis
//     val nome = "João"
//     var idade = 30
//     val email = "joao@example.com"
//     var usuarioAtivo = true

//     // Exibição das informações no console
//     println("Nome: $nome")
//     println("Idade: $idade")
//     println("Email: $email")
//     println("Usuário Ativo: $usuarioAtivo")
// }
