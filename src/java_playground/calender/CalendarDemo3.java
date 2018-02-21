package java_playground.calender;

import java.util.Scanner;

public class CalendarDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print("> ");
			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day~");
				break;
			} else {
				MakeCalendar.make(month);
			}
		}
		sc.close();
	}
}
