package MethodOverloading;

//Method Overloading means --> same method name but different parameters

public class CalculatorExample {
	
	//Method to add two integers
	public int add(int a, int b) {
		return a+b;
	}
	
	// Method to add three integers
	public int add(int a, int b, int c) {
		return a+b+c;	
	}
	
	//Method to add two double numbers
	public double add(double a, double b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		CalculatorExample cal = new CalculatorExample();
		System.out.println(cal.add(6, 9));
		System.out.println(cal.add(9, 6, 5));
		System.out.println(cal.add(9.9, 77.8));
	}
}
