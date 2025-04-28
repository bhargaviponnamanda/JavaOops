package MethodOverloading;

public class Printer {

	// Print integer array
	public void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Print string array
	public void printArray(String[] arr) {
		for (String str : arr) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Printer printer = new Printer();

		int[] numbers = { 1, 2, 3, 4, 5 };
		String[] names = { "Tom", "Jerry", "Spike" };

		printer.printArray(numbers);
		printer.printArray(names);
	}
}
