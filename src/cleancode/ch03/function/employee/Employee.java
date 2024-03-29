package cleancode.ch03.function.employee;

public abstract class Employee {

	public abstract boolean isPayday();

	public abstract Money calculatePay();

	public abstract void deliverPay(Money pay);
}
