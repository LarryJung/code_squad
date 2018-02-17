package gugudan;

import java.util.ArrayList;

public class Gugudan {
	public static ArrayList<Integer> calculate(int number, int times) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i=1; i<=times; i++) {
			result.add(number*i);
		}
		return result;
	}
}
