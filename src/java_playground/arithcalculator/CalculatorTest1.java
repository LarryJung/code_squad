package java_playground.arithcalculator;

import java.util.Scanner;

public class CalculatorTest1 {
	private static Scanner sc;
	private static int result;
	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Text in what want to calc ex) 1+2+3");
		String inputValue = sc.nextLine();
		String[] splitedValues = inputValue.split(" ");
//		System.out.println(splitedValues.length);
//		System.out.println(inputValue);
		for (int i = 0; i < splitedValues.length - 1; i++) {

			int middleResult = 0;
			String sym = splitedValues[i];
			switch (sym) {
			case "+":
				middleResult = Integer.parseInt(splitedValues[i - 1]) + Integer.parseInt(splitedValues[i + 1]);
				splitedValues[i + 1] = Integer.toString(middleResult);
				break;
			case "-":
				middleResult = Integer.parseInt(splitedValues[i - 1]) - Integer.parseInt(splitedValues[i + 1]);
				splitedValues[i + 1] = Integer.toString(middleResult);
				break;
			case "*":
				middleResult = Integer.parseInt(splitedValues[i - 1]) * Integer.parseInt(splitedValues[i + 1]);
				splitedValues[i + 1] = Integer.toString(middleResult);
				break;
			case "/":
				middleResult = Integer.parseInt(splitedValues[i - 1]) / Integer.parseInt(splitedValues[i + 1]);
				splitedValues[i + 1] = Integer.toString(middleResult);
				break;
			default:
				break;
			}
//			System.out.println(middleResult);
			result = middleResult;
		}
		System.out.println(result);
	}

}
