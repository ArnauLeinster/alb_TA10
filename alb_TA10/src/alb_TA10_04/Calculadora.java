package alb_TA10_04;

import MyException.MyException;

public class Calculadora {
	private double n1;
	private double n2;

	public Calculadora(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public void suma() {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}

	public void resta() {
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	}

	public void multiplicacion() {
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
	}

	public void division() {
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	public void potencia() {
		System.out.println("Potencia: " + Math.pow(n1, n2));
	}

	public void raizCuadrada() throws MyException {

		System.out.println("Raiz Cuadrada de " + n1 + " = " + Math.sqrt(n1));
		System.out.println("Raiz Cuadrada de " + n2 + " = " + Math.sqrt(n2));

	}

	public void raizCubica() throws MyException {

		System.out.println("Raiz Cuadrada de " + n1 + " = " + Math.cbrt(n1));
		System.out.println("Raiz Cuadrada de " + n2 + " = " + Math.cbrt(n2));

	}

}
