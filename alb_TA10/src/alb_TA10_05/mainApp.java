package alb_TA10_05;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password p = new Password(8);
		p.esFuerte(p);
		int can = Integer.parseInt(JOptionPane.showInputDialog("Cuantas passwords quieres?"));
		int mida = Integer.parseInt(JOptionPane.showInputDialog("Cuanto quieres que midan?"));
		Password[] pArray = new Password[can];
		boolean[] fuertes = new boolean[can];

		for (int i = 0; i < can; i++) {
			pArray[i] = new Password(mida);
			fuertes[i] = pArray[i].esFuerte(pArray[i]);
			System.out.print(pArray[i].getContra());
			System.out.println(" " + fuertes[i]);
		}
	}

}
