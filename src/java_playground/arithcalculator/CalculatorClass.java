package java_playground.arithcalculator;

import java.util.Arrays;
import java.util.Scanner;

class Input {
	// get integer value
	static int getValue(Scanner sc) {
		int value = sc.nextInt();
		return value;
	}

	// get symbol
	static String getSymbol(Scanner sc) {
		String[] symbols = new String[] { "+", "-", "*", "/", "quit" };
		while (true) {
			System.out.println("symbol : ");
			String symbol = sc.next();
			boolean pass = Arrays.stream(symbols).anyMatch(symbol::equals);
			if (pass == true) {
				return symbol;
			} else {
				System.out.println("not a symbol");
			}
		}
	}

}

class Calculator {
	// calculate
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
}

class Output {
	// output print
	static void print(int result) {
		System.out.println("result : " + result);
	}
}

public class CalculatorClass {
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("first value : ");
		int result = Input.getValue(sc);

		while (true) {
			String symbol = Input.getSymbol(sc);
			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			} else {
				System.out.println("first value : ");
				int second = Input.getValue(sc);
				result = Calculator.calculate(symbol, result, second);
				Output.print(result);
			}
		}
		sc.close();
	}
}
