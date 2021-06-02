package wfr.projetospringbootjpahibernate.services.exceptions;

public class DatabaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DatabaseException () {
		
	}
	
	public DatabaseException (String msg) {
		super(msg);
	}
}