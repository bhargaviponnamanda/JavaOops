package MethodOverloading;

//File: AreaCalculator.java

public class AreaCalculator {

	// Area of square
	double area(double side) {
		return side * side;
	}

	// Area of rectangle
	double area(double length, double breadth) {
		return length * breadth;
	}

	// Area of circle
	double area(float radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		AreaCalculator calc = new AreaCalculator();

		System.out.println("Area of square: " + calc.area(5));
		System.out.println("Area of rectangle: " + calc.area(4, 6));
		System.out.println("Area of circle: " + calc.area(3.5f));
	}
}
