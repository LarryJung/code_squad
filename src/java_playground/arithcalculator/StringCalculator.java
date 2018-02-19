package java_playground.arithcalculator;

import java.util.Scanner;


public class StringCalculator {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("fitst number : ");
		String first = sc.next();
		int result = Integer.parseInt(first);
		while (true) {
			System.out.println("기호 : ");
			String symbol = sc.next();
			
			if (symbol.equals("quit")) {
				System.out.println("result : " + result);
				break;
			} else if (symbol.equals("+")){
				System.out.println("second number : ");
				String second = sc.next();
				int sec = Integer.parseInt(second);
				result = result + sec;
				System.out.println("result : " + result);
			} else if (symbol.equals("+")){
				System.out.println("second number : ");
				String second = sc.next();
				int sec = Integer.parseInt(second);
				result = result + sec;
				System.out.println("result : " + result);
			} else if (symbol.equals("-")){
				System.out.println("second number : ");
				String second = sc.next();
				int sec = Integer.parseInt(second);
				result = result - sec;
				System.out.println("result : " + result);
			} else if (symbol.equals("*")){
				System.out.println("second number : ");
				String second = sc.next();
				int sec = Integer.parseInt(second);
				result = result * sec;
				System.out.println("result : " + result);
			} else if (symbol.equals("/")){
				System.out.println("second number : ");
				String second = sc.next();
				int sec = Integer.parseInt(second);
				result = result / sec;
				System.out.println("result : " + result);
			} else {
				System.out.println("not a symbol");
			}
		}
	}
}
