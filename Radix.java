package conditionalStatement;
import java.util.*;

public class Radix {

	public static void main(String[] args) {
		String num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		num=sc.nextLine();
		
		if(num.matches("[01]+")) {
			System.out.println("This is binary Radix");
		}else if(num.matches("[0-7]+")) {
				System.out.println("This is Octal Radix");
			}else if(num.matches("[0-9]+")) {
					System.out.println("This is decimal Radix");
				}else if(num.matches("[0-F]+")) {
						System.out.println("This is Hexadecimal Radix");
					}else {
						System.out.println("This is invalid number");
					}
						
	}
}
		
	


