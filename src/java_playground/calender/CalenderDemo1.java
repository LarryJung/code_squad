package java_playground.calender;
import java.util.Scanner;

public class CalenderDemo1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("put Nth month : ");
		int month = sc.nextInt();
		Howmanydays.howdays(month);
		sc.close();
	}
}
