package java_playground.arithcalculator;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("fitst number : ");
		int first = sc.nextInt();
		int result = first;
		while (true) {
			String[] symbols = new String[]{"+", "-", "*", "/"};
			System.out.println("기호 : ");
			String symbol = sc.next();
			boolean pass = Arrays.stream(symbols).anyMatch(symbol::equals);
			
			if (symbol.equals("quit")) {
				System.out.println("result : " + result);
				break;
			} else if (pass) {
				System.out.println("second number : ");
				int second = sc.nextInt();

				if (symbol.equals("+")) {
					result = result + second;
					System.out.println("result : " + result);
				} else if (symbol.equals("+")) {
					result = result + second;
					System.out.println("result : " + result);
				} else if (symbol.equals("-")) {
					result = result - second;
					System.out.println("result : " + result);
				} else if (symbol.equals("*")) {
					result = result * second;
					System.out.println("result : " + result);
				} else if (symbol.equals("/")) {
					result = result / second;
					System.out.println("result : " + result);
				} 
			} else {
				System.out.println("not a symbol");
				}
			}
		}
}
