package cleancode.ch06.object;

public abstract class Shape {
	public abstract double area();
}

public class Square implements Shape {
	private Point topLeft;
	private double side;

	public double area() {
		return side * side;
	}
}

public class Rectangle implements Shape {
	private Point topLeft;
	private double height;
	private double width;

	public double area() {
		return height * width;
	}
}

public class Square implements Shape {
	private Point topLeft;
	private double side;

	public double area() {
		return side * side;
	}
}

public class Rectangle implements Shape {
	private Point topLeft;
	private double height;
	private double width;

	public double area() {
		return height * width;
	}
}