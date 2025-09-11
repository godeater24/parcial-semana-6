# Evaluación de Programación en Kotlin

Este proyecto es un **examen práctico** para estudiantes de Kotlin. Está pensado para abrirse en **IntelliJ IDEA** (edición Community o Ultimate).

## Instrucciones rápidas

1. **Abre** este proyecto en IntelliJ (`File → Open…`).
2. Espera a que Gradle sincronice las dependencias.
3. Lee el archivo `EVALUACION.md` para ver:
   - Los **2 retos** que te corresponden según la **paridad de tu Código** (último dígito par o impar).
   - Los **criterios de evaluación**.
4. Implementa las funciones **marcadas con `TODO()`** en:
   - `src/main/kotlin/problems/EvenTasks.kt` (si tu Código termina en número **par**).
   - `src/main/kotlin/problems/OddTasks.kt` (si tu Código termina en número **impar**).
5. Ejecuta la app (Run ▶️) o desde terminal:
   ```bash
   ./gradlew run
   ```
6. Cuando termines, sube el fichero en la plataforma indicada por el profesor.

> Notas:
> - El código **compila** desde el inicio, porque las funciones a resolver están con `TODO()` (lanzan excepción si se ejecutan). Reemplázalas con tu implementación.
> - No es necesario tocar archivos de configuración Gradle.

## Estructura

```
Kotlin-Evaluation-Exam/
  └── src/
      ├── main/
      │   └── kotlin/
      │       ├── Main.kt
      │       └── problems/
      │           ├── EvenTasks.kt
      │           └── OddTasks.kt
      └── test/
          └── (opcional para el profe) 
```

¡Éxitos!
