package Apps;

import Models.CustomStack;

public class Main {
	public static void main(String[] args) {
		CustomStack<String> c = new CustomStack<String>();
		c.push("Coba");
		c.push("asda");
		System.out.println(c.getLast());
		
	}
}
