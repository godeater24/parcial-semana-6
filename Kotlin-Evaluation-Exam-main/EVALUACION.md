# Documento de Evaluación — Programación en Kotlin

**Duración sugerida:** 90 minutos  
**Entregable:** Archivo `.txt` que contenga:
1. El **fork del repositorio** en GitHub/GitLab (enlace).
2. El **enlace a un video** donde evidencie:
    - La ejecución del programa en IntelliJ de acuerdo al último dígito de su código estudiantil.
    - Una breve explicación de cómo abordó y resolvió los retos.

---

## Consideraciones Generales

- **No elimine ni renombre los métodos `TODO()`** ya definidos en los archivos `EvenTasks.kt` y `OddTasks.kt`.  
  Debe **completar las implementaciones dentro de esos métodos**, de lo contrario la ejecución del programa no funcionará correctamente.
- Realice únicamente las implementaciones de los métodos que le corresponden de acuerdo al **último dígito de su código estudiantil**.
- Una vez finalizadas sus implementaciones, **corra el proyecto** (`Run ▶️` en IntelliJ o `./gradlew run` en terminal) para comprobar que los casos de prueba se ejecutan correctamente.

---

## Asignación por paridad del código estudiantil

- Si su código termina en número **PAR (0,2,4,6,8)**: implemente los métodos en `EvenTasks.kt`.
- Si su código termina en número **IMPAR (1,3,5,7,9)**: implemente los métodos en `OddTasks.kt`.

---

## Retos PAR — `EvenTasks.kt`

1. **countVowels(text: String): Int**  
   Retorna cuántas vocales (a, e, i, o, u) hay en el texto, sin distinguir mayúsculas.

2. **isPalindrome(word: String): Boolean**  
   Determina si la palabra o frase es un palíndromo (ignora mayúsculas, espacios y signos de puntuación).

---

## Retos IMPAR — `OddTasks.kt`

1. **countWords(text: String): Int**  
   Retorna el número de palabras en el texto, ignorando múltiples espacios.

2. **selectionSortAscending(nums: MutableList<Int>): MutableList<Int>**  
   Ordena una lista de enteros de menor a mayor usando el algoritmo de **selección** (sin usar `.sorted()`).

---

## Ejecución de pruebas automáticas

- Al correr el proyecto (`Main.kt`), el programa pedirá su **código estudiantil**.
- Según el último dígito, se ejecutarán automáticamente las **pruebas correspondientes** (PAR o IMPAR).
- Los resultados se muestran en consola con etiquetas:
    - **[OK]** → caso correcto
    - **[FALLÓ]** → resultado incorrecto
    - **[TODO]** → método aún no implementado
    - **[ERROR]** → ocurrió una excepción

---

## Rúbrica de Evaluación (100 pts)

1. **Corrección** (45 pts): lógica correcta y manejo de casos borde.
2. **Kotlin básico** (25 pts): uso de `val/var`, `when`, bucles, condiciones.
3. **Legibilidad** (20 pts): nombres claros, comentarios breves, formateo, variables en inglés.
4. **Ejecución** (10 pts): proyecto compila y corre sin errores.

**Puntos extra (+5):** pruebas adicionales o explicaciones claras en el video entregado.

---
