package alb_TA10_04;

import java.util.Scanner;

import javax.swing.JOptionPane;

import MyException.MyException;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean b = true;
		int n1 = 0;
		int n2 = 0;
		while (b) {
			try {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
				b = false;
			} catch (Exception ex) {
				System.out.println("Introduce un numero apropiado");
			}
		}
		Calculadora c1 = new Calculadora(n1, n2);
		c1.suma();
		c1.resta();
		c1.multiplicacion();
		c1.division();
		try {
			if ((n1 >= 0) && (n2 >= 0)) {
				c1.raizCuadrada();
			} else {

				throw new MyException(5);
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
