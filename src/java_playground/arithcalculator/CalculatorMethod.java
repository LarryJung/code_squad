package java_playground.arithcalculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMethod {
	
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
	
	// output print
	static void print(int result) {
		System.out.println("result : " + result);
	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("first value : ");
		int result = getValue(sc);

		while (true) {
			String symbol = getSymbol(sc);
			if (symbol.equals("quit")) {
				print(result);
				break;
			} else {
				System.out.println("first value : ");
				int second = getValue(sc);
				result = calculate(symbol, result, second);
				print(result);
			}
		}
		sc.close();
	}
}
