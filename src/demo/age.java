package demo;
import java.util.*;
public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("Eligible to Vote.");
		}
		System.out.println("Enter the Name:");
		String name = sc.nextLine();
		System.out.println(name+age);
	}

}
