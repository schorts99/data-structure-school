/******************************************************************************
 *  Compilation:  javac Ngon.java
 *  Execution:    java Ngon n
 *  Dependencies: Turtle.java
 *
 *  Plots a regular n-gon.
 *
 *  The side length s of a regular n-gon inscribed in a circle 
 *  of diameter 1 is sin(pi/n).
 *
 ******************************************************************************/

import java.util.Scanner;

public class Ngon {
	private Scanner read;
	private byte
		numero_figuras,
		index;

	public Ngon(byte numero_figuras) throws Validaciones.NumeroFigurasInvalido {
		if (numero_figuras <= 4 && numero_figuras > 0) {
			this.numero_figuras = numero_figuras;
			read = new Scanner(System.in);
			for(index = 0; index < numero_figuras; index++) {
				preguntarMetodo();
			}
		} else {
			throw new Validaciones.NumeroFigurasInvalido();
		}
	}

	public void seleccionarMetodo(String metodo) throws Validaciones.OpcionPintadoInvalida {
		switch(metodo.toLowerCase()) {
			case "normal":
				normal(preguntarLados());
				break;
			case "normal colorido":
				normalColorido(preguntarLados());
				break;
			case "invertido":
				invertido(preguntarLados());
				break;
			case "invertido colorido":
				invertidoColorido(preguntarLados());
				break;
			default: throw new Validaciones.OpcionPintadoInvalida();
		}
	}

	public int preguntarLados() {
		int lados = 0;
		do {
			System.out.print("Ingresa el número de lados: ");
			try {
				lados = read.nextInt();
			} catch(Exception err) {
				System.err.println("\nIngresa un número entero");
			}
		} while(lados < 0);
		return lados;
	}

	public void preguntarMetodo() {
		try {
			System.out.print("Ingresa el método de pintado: ");
			var metodo = read.nextLine();
			seleccionarMetodo(metodo);
		} catch(Validaciones.OpcionPintadoInvalida err) {
			System.err.println("\nIngresa un método de pintado valido");
			preguntarMetodo();
		}
	}

	public void normal(int lados) {
		double angle = 360.0 / lados;
		double step  = Math.sin(Math.toRadians(angle/2.0));   // sin(pi/n)
		Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
		for (int i = 0; i < lados; i++) {
			turtle.goForward(step);
			turtle.turnLeft(angle);
		}
	}

	public void normalColorido(int lados) {
		double angle = 360.0 / lados;
		double step  = Math.sin(Math.toRadians(angle/2.0));
		Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
		for (int i = 0; i < lados; i++) {
			turtle.goForwardWithColors(step);
			turtle.turnLeft(angle);
		}
	}

	public void invertido(int lados) {
		double angle = 360.0 / lados;
		double step  = Math.sin(Math.toRadians(angle/2.0));   
		Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
		for (int i = 0; i < lados; i++) {
			turtle.goForward(step);
			turtle.turnRight(-angle);
		}
	}

	public void invertidoColorido(int lados) {
		double angle = 360.0 / lados;
		double step  = Math.sin(Math.toRadians(angle/2.0));
		Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
		for (int i = 0; i < lados; i++) {
			turtle.goForwardWithColors(step);
			turtle.turnRight(-angle);
		}
	}

	public static class Validaciones {
		public static class NumeroFigurasInvalido extends Exception {
			public NumeroFigurasInvalido() {
				super("El número de figuras ingresado no es válido");
			}
		}

		public static class OpcionPintadoInvalida extends Exception {
			public OpcionPintadoInvalida() {
				super("La opción de pintado seleccionada es invalida");
			}
		}
	}
}