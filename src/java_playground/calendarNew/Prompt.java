package java_playground.calendarNew;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

	public void printMenu() {}
	
	public int parseDay(String week) { return 1;}

	private void cmdCal(Scanner s, Calendar c) {}

	private void cmdSearch(Scanner s, Calendar c) {}

	private void cmdRegister(Scanner s, Calendar c) throws ParseException {}
	
	public void runPrompt() {
		printMenu();

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		boolean isLoop = true;
		while (isLoop) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			switch(cmd) {
			case "1":
				cmdRegister(scanner, cal);
				break;
			case "2":
				cmdSearch(scanner, cal);
				break;
			case "3":
				cmdCal(scanner, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;
				break;		
			}
		}
		System.out.println("Thank you. Bye~");
		scanner.close();
	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}