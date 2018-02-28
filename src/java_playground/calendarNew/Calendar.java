package java_playground.calendarNew;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

public class Calendar {
	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private HashMap<Date, PlanItem> planMap;

	public Calendar() {
		planMap = new HashMap<Date, PlanItem>();
	}

	public void registerPlan(String strDate, String plan) {
		PlanItem p = new PlanItem(strDate, plan);
		planMap.put(p.getDate(), p);
	}

	public PlanItem searchPlan(String strDate) {
		Date date = PlanItem.getDatefromString(strDate);
		return planMap.get(date);
	}

	public boolean isLeapYear(int year) {
		return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		return 1;
	}

	public void printCalendar(int year, int month) {
	}

	private int getWeekDay(int year, int month, int day) {
		return 1;
	}

	// simple test code here
	public static void main(String[] args) throws ParseException {
		Calendar cal = new Calendar();
		System.out.println(cal.getWeekDay(1970, 1, 1) == 4);
		System.out.println(cal.getWeekDay(1971, 1, 1) == 5);
		System.out.println(cal.getWeekDay(1972, 1, 1) == 6);
		System.out.println(cal.getWeekDay(1973, 1, 1) == 1);
		System.out.println(cal.getWeekDay(1974, 1, 1) == 2);

		cal.registerPlan("2017-06-23", "Let's eat beef!");
		System.out.println(cal.searchPlan("2017-06-23").equals("Let's eat beef!"));

	}
}
