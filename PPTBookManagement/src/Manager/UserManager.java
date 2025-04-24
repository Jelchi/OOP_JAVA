package Manager;

import java.util.HashMap;

import Models.User;

public class UserManager {
	
	private HashMap<String, User> users = new HashMap<>();
	
	public void register(User user) {
		//get key
		String name = user.getName(); 
		
		//puts into hashmap
		users.put(name, user); 
	}
	
	public User get(String name) {
		return users.get(name); 
	}
	
	public void delete(String name) {
		users.remove(name); 
	}
	

}
