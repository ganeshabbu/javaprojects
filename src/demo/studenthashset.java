package demo;

import java.util.*;

public class studenthashset {

	public static void main(String[] args) {
		 HashSet<String> students = new HashSet<String>();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no.of students :");
		 int n = sc.nextInt();
		 for (int i = 1;i <= n;i++) {
			 System.out.println("Name of the Student "+i+":");
			 String name = sc.next();
			 students.add(name);
		 }
		 for(String student:students) {
			 System.out.println(student);
		 }
	}

}
