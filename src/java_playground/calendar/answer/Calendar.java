package java_playground.calendar.answer;

public class Calendar {

	int getMaxDaysOfMonth(int year, int month) {
		final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
			MAX_DAYS[1]=29;	
			}
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalender(int year, int month, String weekday) {
		
		int num = 0;
		switch(weekday) {
		case "SU" : num=0; break;
		case "MO" : num=1; break;
		case "TU" : num=2; break;
		case "WE" : num=3; break;
		case "TH" : num=4; break;
		case "FR" : num=5; break;
		case "SA" : num=6; break;
		default : num=0; break;
		} 
		
		System.out.printf("     <<%d년 %d월>>   \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");

		for (int i=1;i<=getMaxDaysOfMonth(year,month)+num;i++) {
			if (i<=num) {
				System.out.printf("   ");
			} else {
			System.out.printf("%3d",i-num);
			}
			if (i%7==0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
	}
}
