package java_playground.gugudan;

import java.util.ArrayList;

public class GugudanMain {
	public static void main(String args[]) {
		int[] input = GugudanInput.input();
		InputValue i1 = new InputValue(input[0], input[1]);
		int first = i1.getFirst();
		int second = i1.getSecond();
		for (int i=2; i<=first; i++) {
			ArrayList<Integer> result = Gugudan.calculate(i, second);
			GugudanOutput.print(result);
		}
		
	}
}
