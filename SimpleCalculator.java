package motioncut;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter  the first number : ");
		int a = s.nextInt();
		System.out.print("Enter  the second number : ");
		int b = s.nextInt();
		System.out.println("Enter your choice 1:Addition ,2:Subtraction ,3:Multiplication ,4:Division");
		int choice = s.nextInt();
			switch(choice)
			{
			case 1: System.out.println("The sum of two numbers is : "+(a+b));
					break;
			case 2: System.out.println("The difference of two numbers is : "+(a-b));
					break;
			case 3: System.out.println("The multiply of two numbers is : "+(a*b));
					break;
			case 4: System.out.println("The division of two numbers is : "+(a/b));
					break;
			default: System.out.println("Invalid Choice ");
			break;
			}
	}

}
