package alb_TA10_03;

import MyException.MyException;

public class Numero {
	private int num;

	public Numero() {
		super();
		this.num = (int) (Math.random() * 1000);
		System.out.println(this.num);
	}

	public void comprovar(int n) {
// impar
		try {
			if ((n % 2) == 0) {
				throw new MyException(2);
			} else {
				throw new MyException(3);
			}
		} catch (MyException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
