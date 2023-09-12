// Desafio: Conversão de Temperaturas

//Input de dados 

fun main() {
    // Solicita a temperatura em graus Celsius ao usuário
    println("Digite a temperatura em graus Celsius:")
    val temperaturaCelsius = readLine()!!.toDouble()

    // Converte a temperatura de Celsius para Fahrenheit usando a fórmula (C * 9/5) + 32
    val temperaturaFahrenheit = temperaturaCelsius * 9/5 + 32

    // Converte a temperatura de Celsius para Kelvin adicionando 273.15
    val temperaturaKelvin = temperaturaCelsius + 273.15

    // Imprime a temperatura em Celsius
    println("Temperatura em Celsius: $temperaturaCelsius°C")

    // Imprime a temperatura em Fahrenheit
    println("Temperatura em Fahrenheit: $temperaturaFahrenheit°F")

    // Imprime a temperatura em Kelvin
    println("Temperatura em Kelvin: $temperaturaKelvin K")
}






/*
fun main() {
    // Define a temperatura em graus Celsius como 25.0
    val temperaturaCelsius = 25.0

    // Converte a temperatura de Celsius para Fahrenheit usando a fórmula (C * 9/5) + 32
    val temperaturaFahrenheit = temperaturaCelsius * 9 / 5 + 32

    // Converte a temperatura de Celsius para Kelvin adicionando 273.15
    val temperaturaKelvin = temperaturaCelsius + 273.15

    // Imprime a temperatura em Celsius
    println("Temperatura em Celsius: $temperaturaCelsius°C")

    // Imprime a temperatura em Fahrenheit
    println("Temperatura em Fahrenheit: $temperaturaFahrenheit°F")

    // Imprime a temperatura em Kelvin
    println("Temperatura em Kelvin: $temperaturaKelvin K")
}

*/