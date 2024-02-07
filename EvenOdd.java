package conditionalStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two numbers");
		a=sc.nextInt();
//		b=sc.nextInt();
		
		if(a%2!=0) {
			System.out.println("This is odd number");
		}else {
			System.out.println("This is Even number");
		}
	}

}
