package MyException;

public class MyException extends Exception {

	private int codigoError;

	public MyException(int codigoError) {
		super();
		this.codigoError = codigoError;
	}

	public MyException() {
		super();
		this.codigoError = codigoError;
	}

	@Override
	public String getMessage() {
		String mensaje = "";
		switch (codigoError) {
		case 1:
			mensaje = "Excepcion capturada";
			break;
		case 2:
			mensaje = "Numero par";
			break;
		case 3:
			mensaje = "Numero impar";
			break;
		case 4:
			mensaje = "Introduzca un numero apropiado";
			break;
		case 5:
			mensaje = "Error matematico";
		}
		return mensaje;

	}
}
