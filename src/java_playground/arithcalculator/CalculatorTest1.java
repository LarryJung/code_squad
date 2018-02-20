package java_playground.arithcalculator;

import java.util.Scanner;

public class CalculatorTest1 {
	private static Scanner sc;

	static int calculate(String symbol, int first, int second) {

		int result = first;

		if (symbol.equals("+")) {
			result = result + second;
		} else if (symbol.equals("-")) {
			result = result - second;
		} else if (symbol.equals("*")) {
			result = result * second;
		} else if (symbol.equals("/")) {
			result = result / second;
		}
		return result;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String Result = null;
		System.out.println("Text in what want to calc ex) 1 + 2 + 3");
		String inputValue = sc.nextLine();
		String[] splitedValues = inputValue.split(" ");

		for (int i = 1; i < splitedValues.length - 1; i+=2) {
			int MiddleResult = 0;
			String symbol = splitedValues[i];
			MiddleResult = calculate(symbol, Integer.parseInt(splitedValues[i - 1]),
					Integer.parseInt(splitedValues[i + 1]));

			Result = Integer.toString(MiddleResult);
			splitedValues[i + 1] = Result;
		} System.out.println("Result : "+ Result);
	}
}
