package conditionalStatement;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		year=sc.nextInt();
		if(year%4==0) {
			System.out.println("This is a leap year");
		}else {
			System.out.print("This is not a leap year");
		}

	}

}
