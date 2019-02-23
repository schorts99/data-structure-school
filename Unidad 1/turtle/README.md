# Turtle y Ngon modificado

### Proposito del proyecto:
Agregar nuevos métodos a la clase Turtle y Ngon para mejorar su funcionalidad

### Versión del proyecto: 0.0.2

### Áutores: Jorge Castillo Díaz

### Instrucciones:
* Windows:
    * Ejecutar run.bat, el script compilara y posteriormente ejecutara la clase Prueba y sus dependencias
* Linux/Mac:
  1. Dar permisos de ejecucución a run.sh ejecutando en la terminal estando previamente en la carpeta del proyecto
  2. Ejecutar run.sh
```bash
$ sudo chmod+x run.sh
$ ./run.sh
```

## Métodos agregados
* turnRight:
  Este método le da la habilidad a la tortuga de girar a la derecha.
  * Parametros recibidos:
    * degrees: Los grados que girara a la derecha
```java
turnRight(double degrees)
```
---
* turnAround:
  * Este método le da la habilidad de dar media vuelta a la tortuga
```java
turnAround()
```
---
* goForwardWithColors:
  * Este método hace que la tortuga deje un rastro de colores al avanzar
  * Parametros recibidos:
    * steps: La cantidad de pasos a avanzar
```java
goForwardWithColors(double steps)
```
* steps: La cantidad de pasos a avanzar
* changeEvery: Cada cuantos pasos la tortuga cambiara su color
```java
goForwardWithColors(double steps, double changeEvery)
```
* steps: La cantidad de pasos a avanzar
* colors: Los colores que usara la tortuga para avanzar
```java
goForwardWithColors(double steps, Color[] colors)
```
* steps: La cantidad de pasos a avanzar
* colors: Los colores que usara la tortuga para avanzar
* changeEvery: Cada cuantos pasos la tortuga cambiara su color
```java
goForwardWithColors(double steps, Color[] colors, double changeEvery)
```
---
* goBackward:
  * Este método le da la habilidad a la tortuga de ir en reversa
```java
goBackward()
```
---
* goBackwardWithColors:
  * Este método hace que la tortuga deje un rastro de colores al retroceder
  * Parametros recibidos:
    * steps: La cantidad de pasos a retroceder
```java
goBackwardWithColors(double steps)
```
* steps: La cantidad de pasos a retroceder
* changeEvery: Cada cuantos pasos la tortuga cambiara su color
```java
goBackwardWithColors(double steps, double changeEvery)
```
* steps: La cantidad de pasos a retroceder
* colors: Los colores que usara la tortuga para avanzar
```java
goBackwardWithColors(double steps, Color[] colors)
```
* steps: La cantidad de pasos a retroceder
* colors: Los colores que usara la tortuga para avanzar
* changeEvery: Cada cuantos pasos la tortuga cambiara su color
```java
goBackwardWithColors(double steps, Color[] colors, double changeEvery)
```