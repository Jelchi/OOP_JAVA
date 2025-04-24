package Models;

public class Teacher extends Person{
	private Integer numCourses; 
	private String[] courses; 
	
	public Teacher(String name, String address) {
		super(name, address); 
		this.courses = new String[5]; 
		numCourses = 0;
	}
	
	public String toString() {
		return "Teacher: "+ super.toString(); 
	}
	
	public boolean addCourse(String course) {
		if(numCourses == 5) {
			System.out.println("Can't take more course");
			return false;
		}
		for(int i=0; i<numCourses; i++) {
			if(this.courses[i].equals(course)) {
				return false; 
			}
		}
		this.courses[numCourses] = course; 
		numCourses++; 
		System.out.println("Successfull add courses");
		return true; 
	}
	
	public boolean removeCourse(String course) {
		boolean found = false; 
		for(int i=0; i<numCourses; i++) {
			if(this.courses[i].equals(course)) {
				for (int j = i; j < numCourses-1; j++) {
					courses[j] = courses[j+1];
				}
				numCourses--; 
				found = true; 
				break;
			}
		}
		if(found == true) {
			System.out.println("Data successfully deleted");
		}else {
			System.out.println("Data not found");
		}
		return found; 
	}
	
	public void printCourses() {
		System.out.println("Courses: ");
		for(int i=0; i<numCourses; i++) {
			System.out.println(courses[i]);
		}
	}

	public Integer getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(Integer numCourses) {
		this.numCourses = numCourses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
}
