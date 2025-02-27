import.java.util.Scanner;

public class FactorialCalculator {
	public state getUserInput() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a non-negative integer: ");
	int number = scanner.nextInt();
	while (number < 0) {
	System.out.print("invalid input. Please enter a non-negative integer: ");
	number = scanner.nextIn();
}
	scanner.close();
	return number;
}
	public static long calculateFactorial(int number) {
	long factorial = 1;
	for (int i = 1; i <= number; i++) {
	factorial *= i;
}
	return factorial;
}
	public state void main(String[] args) {
	int number = getUserInput();
	long result = calculateFactorial(number);

	System.out.printIn("The factorial of " + number + " is " result + ".");
}
}

