package java_playground.calender;

public class MakeCalendar {

	public static void make(int month) {

		int days = Howmanydays2.howdays(month);
		if (days == 0) {
			System.out.println("1~12 사이값을 입력해 주세요.");
		} else {
			System.out.println("SU MO TU WE TH FR SA");
			System.out.println("--------------------");

			for (int i = 1; i <= days / 7; i++) {
				String week = "";
				for (int j = 1; j <= 7; j++) {
					if (7 * (i - 1) + j < 10) {
						week += " " + Integer.toString(7 * (i - 1) + j) + " ";
					} else {
						week += Integer.toString(7 * (i - 1) + j) + " ";
					}
				}
				System.out.println(week);
			}
			if (days / 7 != 0) {
				String week = "";
				for (int i = 1; i <= days % 7; i++) {
					week += Integer.toString(days - days % 7 + i) + " ";
				}
				System.out.println(week);
			}
		}
	}
}
