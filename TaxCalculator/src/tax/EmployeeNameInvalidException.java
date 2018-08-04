package tax;

// exception for Invalid EmployeeName
public class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}