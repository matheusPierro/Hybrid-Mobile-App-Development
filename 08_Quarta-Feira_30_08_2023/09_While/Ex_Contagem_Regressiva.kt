//Ex: Contagem regressiva

// fun main(){

//     println("Digite um número inteiro positivo:")
//     val numero = readLine()!!.toInt() //Solicitando e lendo o numero fornecido pelo usuário

//     var contador = numero //inicializando o contador com o numero fornecido pelo usuario 
//     while(contador >= 1){ //Enquanto o contador for maior ou igual a 1 
//         println(contador) //imprime o valor igual do contator 
//         contador-- //decrementa o contador em 1 cada interação 
 
//     }
// }

//Tratamento de campo vazio
fun main() {
    println("Digite um número inteiro positivo:")
    val input = readLine()
    
    if (input != null && input.isNotEmpty()) {
        val numero = input.toInt()
        
        var contador = numero 
        while (contador >= 1) {
            println(contador)
            contador--
        }
    } else {
        println("Nenhum número digitado")
    }
}
