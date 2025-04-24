package Models;

public class User {
	private Integer id; 
	private String name; 
	private String email; 
	private String username; 
	
	public User(Integer id, String name, String email, String username) {
		this.id = id; 
		this.name = name; 
		this.email = email; 
		this.username = username; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*encapsulation --> untuk menyembunyikan value yang mentah*/
	/*Identifikasinya --> private */
	

	
}
