# Patrones de Diseño Creacionales en Java: Prototype y Singleton

## 📚 Descripción del Curso 
**Tema:** Patrones de Diseño Creacionales - Prototype y Singleton  
**Objetivo de Aprendizaje:** Al finalizar esta sesión, los estudiantes serán capaces de:
1.  Identificar escenarios donde el patrones Singleton es aplicables.
2.  Implementar este patron en Java, comprendiendo la mecánica de la instanciación controlada.
3.  Articular las ventajas y los potenciales inconvenientes de cada patrón.

---
### Contexto del Problema
Nuestra aplicación necesita un administrador central de `AppConfig`. Esta clase contiene configuraciones globales, como el tema y el idioma de la aplicación. Es crucial que solo exista **una única instancia** del objeto `AppConfig` en toda la aplicación. Tener múltiples objetos de configuración podría llevar a settings inconsistentes y bugs extraños.

### Código Inicial (El Problema)
El código actual no impide que múltiples partes de la aplicación creen sus propias instancias de `AppConfig`.

### Tu Tarea: Transformar el código usando el Patrón Singleton (variante de Inicialización Ansiosa - Eager Initialization).

#### Instrucciones Paso a Paso:
1.  **Haz el Constructor Privado:**
    *   Este es el paso más crítico. Evita que cualquier otra clase use la palabra clave `new` para crear una instancia de `AppConfig`.

2.  **Crea una Instancia Estática y Privada:**
    *   Dentro de la clase `AppConfig`, crea un campo `private`, `static` y `final` que contenga la única instancia de la clase.
    *   Inicialízala de manera ansiosa (eagerly) llamando directamente al constructor privado.
    ```java
    private static final AppConfig instance = new AppConfig();
    ```

3.  **Provee un Método Getter Público y Estático:**
    *   Proporciona un método público y estático (comúnmente llamado `getInstance()`) que permita a otras clases obtener una referencia a esta única instancia.
    ```java
    public static AppConfig getInstance() {
        return instance;
    }
    ```

4.  **Actualiza el Código Cliente (Main):**
    *   En la clase `Main`, reemplaza todas las llamadas a `new AppConfig()` por llamadas a `AppConfig.getInstance()`.

#### Preguntas de Análisis:
*   Después de tus cambios, ¿cuál es el resultado de `(config1 == config2)`? ¿Por qué es importante este resultado?
*   ¿Por qué el campo `instance` se declara como `static`?
*   ¿Cuál es la principal desventaja de usar el enfoque de "Inicialización Ansiosa" (Eager Initialization) demostrado aquí? (Pista: ¿cuándo se crea la instancia?). Investiga y prepárate para discutir la alternativa de "Inicialización Perezosa" (Lazy Initialization) en la próxima clase.
*   El patrón Singleton a veces es criticado. ¿Puedes pensar en una potencial desventaja, especialmente en aplicaciones grandes? (Pista: piensa en estado global y capacidad de prueba - testability).

---

## ✅ Cómo Empezar
1.  Clona o descarga este repositorio.
2.  Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ IDEA, VS Code).
3.  Sigue las instrucciones en cada archivo Java para refactorizar el código según el patrón de diseño correspondiente.
4.  Ejecuta el código después de cada cambio para verificar el funcionamiento y observar las diferencias.

## 🧪 Pruebas
Asegúrate de ejecutar el método `main` en la clase `Main` después de realizar cada transformación para verificar que el patrón se ha implementado correctamente y que el comportamiento es el esperado.


Entrega final – Patrón Singleton (Emanuel Villanueva).
