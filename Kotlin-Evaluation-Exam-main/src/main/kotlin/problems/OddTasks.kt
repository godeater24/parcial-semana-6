// src/main/kotlin/problems/OddTasks.kt
package problems

object OddTasks {

    /**
     * TODO
     * Cuenta cuántas consonantes hay en el texto.
     * Ignora mayúsculas/minúsculas y descarta caracteres no alfabéticos.
     * Ejemplo:
     *  - countConsonants("Hola") -> 2
     */
    fun countWords(text: String): Int {
        return text
            .trim()
            .split("\\s+".toRegex())
            .filter { it.isNotEmpty() }
            .size
    }


    /**
     * TODO
     * Determina si una frase es un pangrama,
     * es decir, contiene todas las letras del alfabeto al menos una vez.
     * Ejemplo:
     *  - "El veloz murciélago hindú comía feliz cardillo y kiwi"
     *  - "The quick brown fox jumps over the lazy dog"
     */
    fun selectionSortAscending(nums: MutableList<Int>): MutableList<Int> {
        for (i in 0 until nums.size - 1) {
            var minIndex = i
            for (j in i + 1 until nums.size) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j
                }
            }
            if (minIndex != i) {
                val temp = nums[i]
                nums[i] = nums[minIndex]
                nums[minIndex] = temp
            }
        }
        return nums
    }

