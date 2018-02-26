package java_playground.calendar.answer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prompt3 {
	private Scanner sc;
	private PlanItem user;

	public void runPrompt() throws IOException {
		sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		String wantedDay = null;
		boolean calendarOn = true;
		
		System.out.println("사용자 이름을 입력하세요.\n>>");
		String username = sc.nextLine();
		user = new PlanItem(username);

		
		while (calendarOn) {
			cal.printUI();
			String input = sc.nextLine();

			switch (input) {
			case "1":
		        FileWriter fw = new FileWriter("./src/java_playground/calendar/answer/"+username+".txt");
				System.out.println("[일정 등록] 날짜를 입력하세요.\n>>");
				wantedDay = sc.nextLine();
				System.out.println("일정을 입력하세요.\n>>");
				String toDo = sc.nextLine();
				cal.calendarEnrollment(wantedDay, toDo, user, fw);
				fw.close();
				break;
			case "2":
				BufferedReader br = new BufferedReader(new FileReader("./src/java_playground/calendar/answer/"+username+".txt"));
				System.out.println("[일정 검색] 날짜를 입력하세요.\n>>");
				wantedDay = sc.nextLine();
				cal.searchCalendar(wantedDay, user, br);
				br.close();
				break;
			case "3":
				System.out.println("[달력 보기] 날짜를 입력하세요.\n>>");
				wantedDay = sc.nextLine();
				cal.viewCalendar(wantedDay);
				break;
			case "h":
				cal.viewHelp();
				break;
			case "q":
				System.out.println("Bye~");
				calendarOn = false;
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Prompt3 p3 = new Prompt3();
		p3.runPrompt();
	}
}
