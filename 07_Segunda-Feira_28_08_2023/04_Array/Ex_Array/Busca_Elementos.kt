// Exercicio 4: Busca de elemento
fun main() {
    // Array de strings
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" // Elemento é o que será buscado
    var found = false // Variável para verificar se o elemento foi encontrado

    // Loop para verficar se o elemento esta presente

    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }
    if (found) {
        println("$searchName foi encontrado no array") // print se econtrado
    } else {
        println("$searchName não foi encontrado no array") // print se não econtrado
    }
}
