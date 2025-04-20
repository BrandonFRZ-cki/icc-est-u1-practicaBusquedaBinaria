
# Práctica de Búsqueda Binaria

## 📌 Información General

- **Título:** Práctica de Búsqueda Binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Brandon Fernando Rivera Zambrano
- **Fecha:** 20/04/2025
- **Profesor:** Ing. Pablo Torres

# Guía de Práctica de Laboratorio – Búsqueda Binaria

## 🛠️ Descripción

Este proyecto implementa un sistema de búsqueda binaria en Java sobre un conjunto de personas, organizando previamente los datos mediante el **método de selección**.  
El programa permite:
- Ingresar una lista de personas con su **nombre** y **edad**.
- Ordenarlas por edad usando el **método de selección**.
- Buscar una persona por su edad mediante **búsqueda binaria**.
- Mostrar el proceso de búsqueda paso a paso.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. **Compila el código:**
   ```bash
   javac App.java

## 🚀 Ejecución

Para ejecutar el proyecto:

2. **Ejecuta la aplicación:**
   ```bash
   java App

----
## 🧑‍💻 Ejemplo de Entrada

```plaintext
Ingrese el número de personas que desea listar → 5  
Ingrese el nombre de la persona → Rodrigo  
Ingrese la edad → 57  
Ingrese el nombre de la persona → Cecilia  
Ingrese la edad → 54  
Ingrese el nombre de la persona → Brandon  
Ingrese la edad → 18  
Ingrese el nombre de la persona → Vivi  
Ingrese la edad → 31  
Ingrese el nombre de la persona → Luiz
Ingrese la edad → 30  

Ingrese la edad a buscar → 18  

```
----

## 📌 Ejemplo de Salida

```plaintext
Ordenando Personas ...

Ordenado: 18 | 30 | 31 | 54 | 57  

18 | 30 | 31 | 54 | 57  
bajo = 0 alto = 4 centro = 2 valorCentro = 31 <-- IZQUIERDA  

18 | 30  
bajo=0 alto=1 centro=0 valorCentro=18 -- ENCONTRADO  

La persona con la edad 18 es Brandon  
