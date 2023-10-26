package cleancode.ch03.function.employee;

public interface EmployeeFactory {

	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
