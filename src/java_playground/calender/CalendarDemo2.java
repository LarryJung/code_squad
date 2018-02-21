package java_playground.calender;

import java.util.Scanner;

public class CalendarDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("put any month.");
			System.out.print("> ");
			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day~");
				break;
			} else {
				Howmanydays.howdays(month);
			}
		}
		sc.close();
	}
}
