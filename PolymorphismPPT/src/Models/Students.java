package Models;

public class Students {
	private String nim; 
	private String name; 
	private Integer classCode; 
	
	public Students(String nim, String name, Integer classCode) {
		this.nim = nim; 
		this.name = name; 
		this.classCode = classCode; 
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClassCode() {
		return classCode;
	}

	public void setClassCode(Integer classCode) {
		this.classCode = classCode;
	}
	
}
