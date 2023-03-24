package alb_TA10_02;

import MyException.MyException;

public class mainApp {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MyException(1);
		} catch (Exception ex1) {
			System.out.println(ex1.getMessage());
		}
		System.out.println("Programa terminado");
	}

}
