package alb_TA10_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumeroAleatorio n1 = new NumeroAleatorio();
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.println("Introduzca un numero: ");
				int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));

				incorrecto = n1.comprovar(num);

			} catch (Exception e) {
				System.out.println("Entrada incorrecta");
				n1.setIntentos(n1.getIntentos() + 1);
			}
		}
	}
}
