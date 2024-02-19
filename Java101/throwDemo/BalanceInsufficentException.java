package throwDemo;

public class BalanceInsufficentException extends Exception {
	String message;
public BalanceInsufficentException(String mesage) {
		this.message=message;
	}
public String getMessage() {
	return this.message;
}
}
