package conditionalStatement;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		int marathi,english,maths,science,history,TotalMarks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a marks of Marathi");
		marathi=sc.nextInt();
		System.out.print("Enter a marks of English");
		english=sc.nextInt();
		System.out.print("Enter a marks of Maths");
		maths=sc.nextInt();
		System.out.print("Enter a marks of Science");
		science=sc.nextInt();
		System.out.print("Enter a marks of History");
		history=sc.nextInt();

		TotalMarks=((marathi+english+maths+science+history)*100);
		if (TotalMarks >= 80) {
            System.out.println("You got A+ grade");
        } else if (TotalMarks >= 70) {
            System.out.println("You got A grade");
        } else if (TotalMarks >= 60) {
            System.out.println("You got B grade");
        } else if (TotalMarks >= 35) {
            System.out.println("You got C grade");
        } else {
            System.out.println("Sorry, you have failed. Try again. Never Give Up!!!");
        }
		
	}

}
