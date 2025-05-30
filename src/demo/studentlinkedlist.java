package demo;

import java.util.*;

public class studentlinkedlist {

	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Names of 5 students");
		for (int i =1;i<=5;i++)
		{
			System.out.println("Enter name of Student "+i+":");
			String name = sc.nextLine();
			students.add(name);
		}
		System.out.println("Students name are:");
		for(String student : students)
		{
			System.out.println(student);
		}
		sc.close();
	}

}
