⚠️ El ReadMe fue realizado completamente por la IA

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwTCPqQXh9MUu7vdJx9qb_MKV2N7XM8SZFuw&s" width="300" alt="Logo">

---

# ProyectoInvestigadores

Proyecto Java que simula distintos tipos de investigadores (Matemático, Biólogo y Químico) mediante el uso de herencia, clases abstractas, interfaces y control de errores.

El programa permite interactuar con cada investigador mediante menús independientes desde consola.

---

## Funcionamiento general

El sistema parte de una clase `App` que muestra un menú principal donde el usuario puede seleccionar el tipo de investigador con el que desea trabajar.  
Cada investigador tiene su propio submenú con operaciones específicas, pero todos comparten funcionalidades comunes heredadas de la clase abstracta `Investigador`.

Se utiliza control de excepciones (`try-catch-finally`) para gestionar entradas incorrectas del usuario.

---

## Arquitectura del proyecto

### `Investigador`
Clase abstracta base que define la estructura común de todos los investigadores.

| Atributo | Tipo | Descripción |
|---|---|---|
| `nombre` | `String` | Nombre del investigador |
| `especialidad` | `String` | Área de especialización |
| `sueldo` | `int` | Salario del investigador |

#### Métodos principales
- `identificacion()` → Devuelve los datos del investigador.
- `hacerCalculo(int num1, int num2)` → Realiza suma y resta.
- `estadoSueldo()` → Método abstracto (implementado por cada clase).
- `trabajar()` → Método abstracto (implementado por cada clase).

---

## Actividad 1 — Matemático

Simula operaciones con matrices 3x3. Permite multiplicar o sumar matrices introducidas por el usuario.

### `Matematico`
Extiende `Investigador`.

| Atributo | Tipo | Descripción |
|---|---|---|
| `resultadosActuales` | `int[][]` | Matriz de resultados almacenados |

#### Funcionalidad
- Multiplicación de matriz por un número
- Suma de matrices 3x3
- Interacción por consola dentro del método `trabajar()`

---

## Actividad 2 — Biólogo

Gestiona una lista de especímenes biológicos y permite ordenarlos o eliminarlos según su longitud.

### `Biologo`
Extiende `Investigador` e implementa `Colaboracion`.

| Atributo | Tipo | Descripción |
|---|---|---|
| `especimenes` | `ArrayList<String>` | Lista de especímenes registrados |

#### Funcionalidad
- Añadir especímenes
- Ordenar por longitud (burbuja)
- Eliminar el último elemento tras ordenar
- Invertir lista (`trabajoDual`)

#### Interfaz `Colaboracion`
Define el método:
- `trabajoDual()` → Inversión de listas

---

## Actividad 3 — Químico

Similar al biólogo, pero trabajando con elementos químicos.

### `Quimico`
Extiende `Investigador` e implementa `Colaboracion`.

| Atributo | Tipo | Descripción |
|---|---|---|
| `elementos` | `ArrayList<String>` | Lista de elementos químicos |

#### Funcionalidad
- Añadir elementos
- Invertir lista
- Ordenar por longitud
- Eliminar último elemento tras ordenación

---

## Interfaz — Colaboracion

Define comportamiento adicional para clases colaborativas.

```java
public interface Colaboracion {
    public String trabajoDual();
}
