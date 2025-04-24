package Models;

public class Student extends Person{
	private Integer numCourses; 
	private String[] courses;
	private Integer[] grades; 
	
	public Student(String name, String address) {
		super(name, address);
		this.numCourses = 0; 
		this.courses = new String[30]; 
		this.grades = new Integer[30]; 
	}
	
	public String toString() {
		return "Student : " + super.toString(); 
	}
	
	public void addCourseGrade(String courses, Integer grades) {
		if(numCourses == 30) {
			System.out.println("Can't take more course");
			return;
		}
		this.courses[numCourses] = courses; 
		this.grades[numCourses] = grades; 
		numCourses++; 
		System.out.println("Successfully add course");
	}
	
	public void printGrades() {
		if(numCourses == 0) {
			System.out.println("There is no course taken");
			return;
		}
		System.out.println("Grades: ");
		for(int i=0; i<numCourses; i++) {
			System.out.println(courses[i] + ":" + grades[i]);
		}
	}
	
	public double getAverageGrade() {
		Integer sum = 0; 
		for(int i=0; i<numCourses; i++) {
			sum +=grades[i]; 
		}
		return sum/numCourses;
	}
}
