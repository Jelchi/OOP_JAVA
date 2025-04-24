package Manager;

import java.util.ArrayList;

import Models.Order;

public class OrderManager {
	private ArrayList<Order>orders = new ArrayList<>(); 
	
	public void add(Order order) {
		orders.add(order); 
	}
	
	public void list() {
		for(Order order: orders) { 
			Integer id = order.getId(); 
			String user = order.getUser().getName(); 
			String book = order.getBook().getTitle(); 
			System.out.printf("%d. %s - %s \n", id, user, book); 
		}
	}
	
	public void delete(Integer id) {
		for(Order order : orders) {
			if(order.getId().equals(id)) {
				orders.remove(order); 
				return; 
			}
		}
	}
}
