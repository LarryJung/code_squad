package java_playground.calendar.answer;

import java.util.Scanner;

public class Prompt {
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		while (true) {
			System.out.println("\n연도를 입력하세요.");
			System.out.print("YEAR>>");
			int year = sc.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>>");
			int month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month < 1 | month > 12) {
				System.out.println("1부터 12 사이값을 입력해주세요.");
				continue;
			}
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
			System.out.print("WEEKDAY>>");
			String weekday = sc.next();
			if (weekday == "-1") {
				break;
			}
//			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, cal.getMaxDaysOfMonth(year, month));
			cal.printSampleCalender(year, month, weekday);
		}
		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
