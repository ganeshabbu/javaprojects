package javaProjects;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the A value:");
		 Double  a = sc.nextDouble();
		 System.out.println("Enter the B value:");
		 Double b = sc.nextDouble();
		 System.out.println("Enter the operation you wanna perform(+,-,*,/):");
		 char s = sc.next().charAt(0);
		 switch(s) {
		 case '+':
			 System.out.println(a+b);
			 break;
		 case '-':
			 System.out.println(a-b);
			 break;
		 case '*':
			 System.out.println(a*b);
			 break;
		 case '/':
			 System.out.println(a/b);
			 break;
		default:
			System.out.println("enter a valid operation!!");
			 }
		 sc.close();
	}

}
