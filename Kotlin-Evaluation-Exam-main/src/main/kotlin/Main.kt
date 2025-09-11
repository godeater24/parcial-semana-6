import problems.EvenTasks
import problems.OddTasks

fun main() {
    println("=== Evaluación Kotlin ===")
    print("Ingresa tu código estudiantil: ")
    val code = readln().trim()

    val lastDigit = code.lastOrNull()?.digitToIntOrNull()
    if (lastDigit == null) {
        println("Código inválido, debe terminar en un número.")
        return
    }

    if (lastDigit % 2 == 0) {
        println("\nTu código es PAR → ejecutando retos PAR...\n")

        print("Ingresa un texto o palabra: ")
        val input = readln()

        val vowels = EvenTasks.countVowels(input)
        val palindrome = EvenTasks.isPalindrome(input)

        println("\nResultados:")
        println("- Número de vocales: $vowels")
        println("- ¿Es palíndromo?: ${if (palindrome) "Sí" else "No"}")

        println("\n=== Casos de prueba PAR ===")
        val samples = listOf("Hola", "reconocer", "Anita lava la tina", "Kotlin")
        for (s in samples) {
            val vc = EvenTasks.countVowels(s)
            val pal = EvenTasks.isPalindrome(s)
            println("• \"$s\" -> vocales=$vc, palíndromo=${if (pal) "Sí" else "No"}")
        }

    } else {
        println("\nTu código es IMPAR → ejecutando retos IMPAR...\n")

        print("Ingresa un texto o frase: ")
        val input = readln()

        val consonants = OddTasks.countConsonants(input)
        val pangram = OddTasks.isPangram(input)

        println("\nResultados:")
        println("- Número de consonantes: $consonants")
        println("- ¿Es pangrama?: ${if (pangram) "Sí" else "No"}")

        println("\n=== Casos de prueba IMPAR ===")
        val samples = listOf(
            "Hola mundo",
            "The quick brown fox jumps over the lazy dog",
            "El veloz murciélago hindú comía feliz cardillo y kiwi",
            "Kotlin es genial"
        )
        for (s in samples) {
            val cc = OddTasks.countConsonants(s)
            val pan = OddTasks.isPangram(s)
            println("• \"$s\" -> consonantes=$cc, pangrama=${if (pan) "Sí" else "No"}")
        }
    }
}
