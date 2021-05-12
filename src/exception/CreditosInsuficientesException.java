package exception;

public class CreditosInsuficientesException extends Exception{

	public CreditosInsuficientesException() {
		super("No posee creditos suficientes");
	}
}
