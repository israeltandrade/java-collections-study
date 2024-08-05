package collections_exercises;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {

	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		
		System.out.print("How many students for course A? ");
		int studentsNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Provide the ID (two digits) of the ");
			System.out.print(i + 1);
			System.out.print("st student: ");
			courseA.add(sc.nextInt());
			sc.nextLine();
		}
		
		System.out.println();
		
		System.out.print("How many students for course B? ");
		studentsNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Provide the ID (two digits) of the ");
			System.out.print(i + 1);
			System.out.print("st student: ");
			courseB.add(sc.nextInt());
			sc.nextLine();
		}
		
		System.out.println();
		
		System.out.print("How many students for course C? ");
		studentsNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Provide the ID (two digits) of the ");
			System.out.print(i + 1);
			System.out.print("st student: ");
			courseC.add(sc.nextInt());
			sc.nextLine();
		}
		
		System.out.println();

		Set<Integer> totalCourseStudents = new HashSet<>(courseA);
		totalCourseStudents.addAll(courseB);
		totalCourseStudents.addAll(courseC);
		
		System.out.println(totalCourseStudents.toString());
		
		System.out.println("Total students: " + totalCourseStudents.size());
		
		sc.close();
				
	}
	
}
