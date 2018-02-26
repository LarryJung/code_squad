package java_playground.calendar.answer;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Calendar {

	public int CountLeapYear(int year) {
		int countleapyear = 0;
		if (year >= 1582) {
			for (int i = 1582; i <= year; i++) {
				if (CheckLeapYear(i) == true) {
					countleapyear += 1;
				}
			}
		} else {
			for (int i = year; i < 1582; i++) {
				if (CheckLeapYear(i) == true) {
					countleapyear += 1;
				}
			}
		}
		return countleapyear;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (CheckLeapYear(year) == true) {
			MAX_DAYS[1] = 29;
		}
		return MAX_DAYS[month - 1];
	}

	public int parseDay(String firstDay) {
		int parseday = 0;
		switch (firstDay) {
		case "SU":
			parseday = 0;
			break;
		case "MO":
			parseday = 1;
			break;
		case "TU":
			parseday = 2;
			break;
		case "WE":
			parseday = 3;
			break;
		case "TH":
			parseday = 4;
			break;
		case "FR":
			parseday = 5;
			break;
		case "SA":
			parseday = 6;
			break;
		default:
			parseday = 0;
			System.out.println("제대로 입력해 주세요.");
			break;
		}
		return parseday;
	}

	public boolean CheckLeapYear(int year) {
		if (year >= 1582) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (year % 4 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public String firstDayNameOfMonth(int year, int month) {
		String firstDay = null;
		int remainYears = Math.abs(1582 - year);
		int days = 0;
		int remainDays = 0;
		if (month == 10) {
			days = -14;
			remainDays = remainYears * 365 + CountLeapYear(year) + days;
		} else if (month > 10) {
			for (int i = 1; i <= month - 10; i++) {
				days = days + getMaxDaysOfMonth(year, month - i);
			}
			days = days - 14;
			remainDays = remainYears * 365 + CountLeapYear(year) + days;
		} else {
			for (int i = month; i < 10; i++) {
				days = days + getMaxDaysOfMonth(year, i);
			}
			days = days - 14;
			remainDays = remainYears * 365 + CountLeapYear(year) - days;
		}
		switch (remainDays % 7) {
		case 0:
			firstDay = "FR";
			break;
		case 1:
			firstDay = "SA";
			break;
		case 2:
			firstDay = "SU";
			break;
		case 3:
			firstDay = "MO";
			break;
		case 4:
			firstDay = "TU";
			break;
		case 5:
			firstDay = "WE";
			break;
		case 6:
			firstDay = "TH";
			break;
		}
		return firstDay;
	}

	public void printSampleCalender(int year, int month, String firstDayNameOfMonth) {
		int num = parseDay(firstDayNameOfMonth);
		System.out.println();
		System.out.printf("     <<%d년 %d월>>   \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");

		for (int i = 1; i <= getMaxDaysOfMonth(year, month) + num; i++) {
			if (i <= num) {
				System.out.printf("   ");
			} else {
				System.out.printf("%3d", i - num);
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public void printCalendar(int year, int month) {
		int num = parseDay(firstDayNameOfMonth(year, month));
		System.out.println();
		System.out.printf("    << %d년 %d월 >>  \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");

		if (year == 1582 & month == 10) {
			System.out.println("     1  2  3  4 15 16");
			System.out.println(" 17 18 19 20 21 22 23");
			System.out.println(" 24 25 26 27 28 29 30");
			System.out.println(" 31");
		} else {

			for (int i = 1; i <= getMaxDaysOfMonth(year, month) + num; i++) {
				if (i <= num) {
					System.out.printf("   ");
				} else {
					System.out.printf("%3d", i - num);
				}
				if (i % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}

	public void printUI() {
		System.out.println();
		System.out.println("+--------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+--------------------+");
		System.out.println("명령 (1, 2, 3, h, q)");
	}

	public void calendarEnrollment(String wantedDay, String toDo, PlanItem user, FileWriter fw) throws IOException {
		user.arraylist1.add(toDo);
		user.map1.put(wantedDay, user.arraylist1);
		fw.write(wantedDay + "," + toDo + "\n");
	}

	public void searchCalendar(String wantedDay, PlanItem user, BufferedReader br) throws IOException {
		// if (user.map1.containsKey(wantedDay)) {
		// List lists = (List) user.map1.get(wantedDay);
		// System.out.println(Arrays.toString(lists.getItems()));
		// }
		String line = null;
		
		while ((line = br.readLine()) != null) {
			if (line.startsWith(wantedDay)) {
				System.out.println(line);
			}
		}
	}

	public void viewCalendar(String wantedDay) {
		String[] splitedValues = wantedDay.split("-");
		int year = Integer.parseInt(splitedValues[0]);
		int month = Integer.parseInt(splitedValues[1]);
		printCalendar(year, month);
	}

	public void viewHelp() {
		// TODO Auto-generated method stub

	}
}
