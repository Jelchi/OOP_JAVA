 package Apps;

import Models.Person;
import Models.Student;
import Models.Teacher;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Jelvis Anggono", "Bina Nusantara"); 
		s.addCourseGrade("Discrete Mathematic", 98);
		s.addCourseGrade("Linear Algebra", 95);
		s.addCourseGrade("Data Structur", 78);
		s.addCourseGrade("OOP", 100);
		
		s.printGrades();
		System.out.println("Rata-rata: ");
		System.out.println(s.toString() + "= " + s.getAverageGrade());
		
		Teacher t = new Teacher("Jelena Anggono", "Intitut Teknologi batam"); 

		t.addCourse("Discrete Mathematic"); 
		t.addCourse("Accounting");
		t.addCourse("Linear Algebra"); 
		t.addCourse("Mandarin"); 
		t.addCourse("PPKN"); 
		t.addCourse("Biologi");
		
		t.removeCourse("Linear ad"); 
		t.removeCourse("Biologi"); 
		System.out.println(t.toString());
		t.printCourses();
	}
}
