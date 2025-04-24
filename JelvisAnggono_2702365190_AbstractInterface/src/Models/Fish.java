package Models;

import Interface.Pet;

public class Fish extends Animal implements Pet{
	private String name; 
	
	public Fish() {
		super(0); 
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name; 
	}

	@Override
	public void play() {
		System.out.println("Ikan main dilautan");
	}
	
	@Override
	public void walk() {
		System.out.println("Ikan tidak punya kaki");
	}

	@Override
	public void eat() {
		System.out.println("Ikan makan plankton");
	}
	

}
