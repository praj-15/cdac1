package collage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {

	static List<Student> student = new ArrayList<>();

	private static void addGradStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Studentname : ");
		String name = sc.nextLine();
		System.out.println("Enter the Student Id : ");
		int id = sc.nextInt();
		System.out.println("Enter the Grade of Student : ");
		double grade = sc.nextDouble();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the Address : ");
		String address = sc.nextLine();
		sc.nextLine();
		Grad g = new Grad(name, id, grade, age, address);
		student.add(g);
		g.isPassed();
		sc.close();

	}

	private static void addUnderGradStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Studentname : ");
		String name = sc.nextLine();
		System.out.println("Enter the Student Id : ");
		int id = sc.nextInt();
		System.out.println("Enter the Grade of Student : ");
		double grade = sc.nextDouble();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the Address : ");
		String address = sc.nextLine();
		sc.nextLine();
		Undergrad ug = new Undergrad(name, id, grade, age, address);
		student.add(ug);
		ug.isPassed();
		sc.close();

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice;

			do {
				System.out.println("\nPlease Enter the choice \n1.Grad\n2.UnderGrad\n3.exit\n:");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					addGradStudent();
					break;

				case 2:
					addUnderGradStudent();
					break;

				case 3:
					System.out.println("Exiting Program");
					break;
				}
				

			} while (choice != 0);
			sc.close();
		}
	}
}
