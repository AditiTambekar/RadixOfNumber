package conditionalStatement;
import java.util.*;

public class YoungOld {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age");
		age=sc.nextInt();
		if(age>=18) {
			System.out.println("Your are young");
		}else {
			System.out.print("Your are a teenagers");
		}

	}

}
