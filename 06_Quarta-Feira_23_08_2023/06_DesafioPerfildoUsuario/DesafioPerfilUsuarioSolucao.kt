//Desafio Perfil Usuario  - Com Input

fun main() {

    //Solicitando entrada dos dados do usuario
    println("Digite seu nome:")
    val nome = readLine()!!

    println("Digite seu idade:")
    val idade = readLine()!!.toInt()

    println("Digite seu email:")
    val email = readLine()!!

    println("O usuário está ativo?(true/false):")
    val usuarioAtivo = readLine()!!.toBoolean()

    //Exibição das informações no console 
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
