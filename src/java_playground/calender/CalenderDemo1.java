package java_playground.calender;
import java.util.Scanner;

public class CalenderDemo1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("put Nth month : ");
		int month = sc.nextInt();
		int days = 0;
		String answer = null;
		switch(month) {
		case 1 : days = 31;
		break;
		
		case 2 : days = 28;
		break;
		
		case 3 : days = 31;
		break;
		
		case 4 : days = 30;
		break;
		
		case 5 : days = 31;
		break;
		
		case 6 : days = 30;
		break;
		
		case 7 : days = 31;
		break;
		
		case 8 : days = 31;
		break;
		
		case 9 : days = 30;
		break;
		
		case 10 : days = 31;
		break;
		
		case 11 : days = 30;
		break;
		
		case 12 : days = 31;
		break;
		
		default : answer = "bye~" ;
		break;
		}
		if (days != 0) {
			System.out.println(month+"month has "+days+" days");
		} else {
			System.out.println(answer);
		}
		sc.close();
	}
}
