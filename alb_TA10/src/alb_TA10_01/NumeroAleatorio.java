package alb_TA10_01;

public class NumeroAleatorio {
	private int num;
	private int intentos = 0;

	public NumeroAleatorio() {
		super();
		this.num = (int) (Math.random() * 10);
	}

	public boolean comprovar(int n) {
		if (n == num) {
			System.out.println("Has acertado el numero secreto en " + intentos + " intentos");
			return false;
		} else {
			intentos++;
			diferencia(n);
			return true;
		}
	}

	private void diferencia(int n) {
		// TODO Auto-generated method stub
		if (n < num) {
			System.out.println("El numero secreto es mayor que " + n);
		} else {
			System.out.println("El numero secreto es menor que " + n);
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

}
