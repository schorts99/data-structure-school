# 3 Análisis de StdDraw

### Proposito del proyecto:

Realizar pruebas con la clase StdDraw sobre su funcionamiento

### Versión del proyecto: 0.0.1

### Áutores: Jorge Castillo Díaz

### Instrucciones:

1. Compilar y ejecutar:
	* Linux/Mac:
		1. Dar permisos de ejecucución a index.sh
		2. Ejecutar index.sh
	* Manualmente:
		1. Compilar la clase Prueba indicado como classpath la ruta previa a esta, indicando la carpeta bin como ubicación para los archivos de salida.
		2. Ejecutar igualmente Prueba pasandole como classpath la ruta previa además de la carpeta bin e indicando además la prueba a ejecutar, las opciones son las siguientes:
			* tamaño
			* escala

#### Proceso automatizado

```bash
$ chmod+x index.sh
$ ./index.sh
```

#### Proceso manual

```bash
$ javac -d bin -cp ../ Prueba.java
$ java -cp ../:bin Prueba "PruebaSolicitada"
```