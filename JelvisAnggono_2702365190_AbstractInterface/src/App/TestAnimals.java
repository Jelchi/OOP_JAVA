package App;

import Interface.Pet;
import Models.Animal;
import Models.Cat;
import Models.Fish;
import Models.Spider;

public class TestAnimals {
	public static void main(String[] args) {
		Fish d = new Fish(); 
		Cat c = new Cat("Fluffy"); 
		Animal a = new Fish(); 
		Animal e = new Spider(); 
		Pet p = new Cat(); 
		
		// calling the methods in each object
		System.out.println("Metode Pada Kelas Fish");
		d.eat();
		d.play();
		d.walk();
		System.out.println("======================================");
		System.out.println(" ");

		System.out.println("Metode Pada Kelas Cat ");
		c.eat();
		c.play();
		c.walk();
		System.out.println("======================================");
		System.out.println(" ");
		
		//Super Class 
		System.out.println("Metode Pada Kelas Animal");
		a.eat();
		a.walk();
		e.eat();
		e.walk();
		System.out.println("======================================");
		System.out.println(" ");
		
		System.out.println("Interphase");
		p.setName("Felix");
		p.play();
		
		//Casting Object
		((Spider) e).eat(); 
		((Spider) e).walk();
		System.out.println(" ");

		((Fish) a).eat();
		((Fish) a).walk();
		System.out.println(" ");
		
		//polymorphism
		Animal[]animals = {d, c, e};
		for(Animal animal : animals) {
			animal.eat();
			animal.walk();
		}
		System.out.println(" ");
	}
}
