Documentación del Proyecto Patrones State y Strategy
1. Introducción
Este proyecto implementa ejemplos prácticos de los patrones de diseño State y Strategy en Java.
El objetivo es mostrar cómo aplicar estos patrones para resolver problemas comunes de comportamiento, mejorando la modularidad, la extensibilidad y la mantenibilidad del código.

2. Arquitectura del Proyecto
El repositorio sigue una estructura organizada por paquetes:
Patrones-State-y-Strategy/
│── src/main/java/com/christian/patrones/
│   ├── state/        # Implementación del patrón State
│   ├── strategy/     # Implementación del patrón Strategy
│   └── main/         # Ejemplos de uso y ejecución
│── test/             # Pruebas unitarias
│── docs/             # Documentación técnica y diagramas UML
│── README.md

3. Requisitos
- Java 11+
- Apache Maven
- JUnit para pruebas unitarias

4. Instalación y Ejecución
Clonar el repositorio
git clone https://github.com/christian-garces/Patrones-State-y-Strategy.git
cd Patrones-State-y-Strategy

Compilar y ejecutar
mvn clean install
mvn exec:java -Dexec.mainClass="com.christian.patrones.Main"

5. Ejemplos de uso
Patrón State
Permite cambiar el comportamiento de un objeto según su estado interno.
public interface Estado {
    void manejar();
}

public class EstadoActivo implements Estado {
    public void manejar() {
        System.out.println("El sistema está activo.");
    }
}

Patrón Strategy
Permite definir una familia de algoritmos y encapsularlos para intercambiarlos dinámicamente.
public interface Estrategia {
    int operar(int a, int b);
}

public class Suma implements Estrategia {
    public int operar(int a, int b) {
        return a + b;
    }
}

6. Pruebas
Ejecuta las pruebas unitarias con:
mvn test

7. Roadmap
- [ ] Añadir más ejemplos de patrones de comportamiento (Observer, Command).
- [ ] Documentar con diagramas UML cada patrón.
- [ ] Implementar ejemplos con casos de negocio reales.
- [ ] Integrar con Docker para despliegue rápido.




