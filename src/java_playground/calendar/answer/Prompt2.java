package java_playground.calendar.answer;

import java.util.Scanner;

public class Prompt2 {
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
//			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, cal.getMaxDaysOfMonth(year, month));
			cal.printCalendar(year, month);
		}
		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		Prompt2 p2 = new Prompt2();
		p2.runPrompt();
	}

}
