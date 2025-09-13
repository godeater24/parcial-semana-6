// src/main/kotlin/problems/OddTasks.kt
package problems

object OddTasks {

    /**
     * Cuenta cuántas consonantes hay en el texto.
     * Ignora mayúsculas/minúsculas y descarta caracteres no alfabéticos.
     * Ejemplo:
     *  - countConsonants("Hola") -> 2
     */
    fun countConsonants(text: String): Int {
        // Definimos las vocales
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        
        return text
            .lowercase()                          // ignoramos mayúsculas
            .filter { it.isLetter() }              // solo letras
            .count { it !in vowels }               // contamos los que NO son vocales
    }

    /**
     * Determina si una frase es un pangrama,
     * es decir, contiene todas las letras del alfabeto al menos una vez.
     * Ejemplo:
     *  - "El veloz murciélago hindú comía feliz cardillo y kiwi"
     *  - "The quick brown fox jumps over the lazy dog"
     */
    fun isPangram(text: String): Boolean {
        val alphabet = ('a'..'z').toSet()

        val lettersInText = text
            .lowercase()
            .filter { it.isLetter() }
            .toSet()

        return lettersInText.containsAll(alphabet)
    }
}
