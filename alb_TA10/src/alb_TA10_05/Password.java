package alb_TA10_05;

public class Password {
	private int length;
	private String contra;

	public Password() {
		super();
	}

	public Password(int length) {
		super();
		this.length = length;
		this.contra = genera(length);
	}

	public boolean esFuerte(Password p) {
		char cha;
		int mayus = 0;
		int minus = 0;
		int numeric = 0;
		for (int i = 0; i < p.contra.length(); i++) {

			cha = p.contra.charAt(i);
			if (Character.isUpperCase(cha)) {
				mayus++;
			} else if (Character.isLowerCase(cha)) {
				minus++;
			} else if (Character.isDigit(cha)) {
				numeric++;
			}
			if ((mayus > 2) && (minus > 1) && (numeric > 5)) {
				return true;
			}
		}

		return false;
	}

	public String genera(int n) {

		String ul = "";

		String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] alphabet = new char[alfa.length()];

		for (int i = 0; i < alfa.length(); i++) {
			alphabet[i] = alfa.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			ul = ul + alphabet[(int) (Math.random() * alfa.length())];
		}
		return ul;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getContra() {
		return contra;
	}

}
