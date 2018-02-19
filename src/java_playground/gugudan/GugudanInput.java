package java_playground.gugudan;

import java.util.Scanner;

public class GugudanInput {
	
	
	private static Scanner scanner;

	public static int[] input() {
	int[] input = new int[2];
		
	System.out.println("Text in : ");
	
	scanner = new Scanner(System.in);
	String inputValue = scanner.nextLine();
	String[] splitedValue = inputValue.split(",");
	
	int first = Integer.parseInt(splitedValue[0]);
	int second = Integer.parseInt(splitedValue[1]);

	input[0] = first;
	input[1] = second;
	
	return input;
	}
}