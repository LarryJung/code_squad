package java_playground.arithcalculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMethod {
	static int getFirstValue(Scanner sc) {
		System.out.println("fitst number : ");
		int first = sc.nextInt();
		return first;
	}

	static int getSecondValue(Scanner sc) {
		System.out.println("second number : ");
		int second = sc.nextInt();
		return second;
	}

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
	
	static void print(int result) {
		System.out.println("result : " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = getFirstValue(sc);

		while (true) {
			String symbol = getSymbol(sc);
			if (symbol.equals("quit")) {
				print(result);
				break;
			} else {
				int second = getSecondValue(sc);
				result = calculate(symbol, result, second);
				print(result);
			}
		}
		sc.close();
	}
}
