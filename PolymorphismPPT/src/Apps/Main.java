package Apps;

import java.util.Scanner;

import Models.Students;
import Models.Teacher;
import Utils.DisplayApps;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name, nim; 
		Integer classCode; 
		
		System.out.println("Input name: ");
		name = input.nextLine();	
		
		System.out.println("Input nim: ");
		nim = input.nextLine(); 
		
		System.out.println("Input class code: ");
		classCode = input.nextInt(); 
		input.nextLine(); 
		
		Students s = new Students(name , nim, classCode);
		
		String teacherName; 
		String teacherId; 
		
		System.out.println("Input id: ");
		teacherName = input.nextLine(); 
		
		System.out.println("Input name: ");
		teacherId = input.nextLine(); 
		
		Teacher t = new Teacher(teacherId, teacherName);
		
		DisplayApps.detail(s);
		DisplayApps.detail(t);
		
		
	}
}
