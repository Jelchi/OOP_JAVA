package Utils;

import Models.Students;
import Models.Teacher;

public class DisplayApps {
	// @overloading
	public static void detail(Teacher t) {
		System.out.println("Teacher ID: " + t.getId());
		System.out.println("Name: "+ t.getName());
	}
	
	public static void detail(Students s) {
		System.out.println("NIM: " + s.getNim());
		System.out.println("Name: " + s.getName());
		System.out.println("Class Code: "+ s.getClassCode());
	}
}
