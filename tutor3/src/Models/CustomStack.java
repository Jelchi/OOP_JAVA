package Models;

import java.util.ArrayList;

public class CustomStack<E> {
	private ArrayList<E> list = new ArrayList<>(); 
	
	public void push(E value) {
		list.add(value); 
	}
	
	public E getLast() {
		return list.get(list.size()-1); 
		
	}
}
