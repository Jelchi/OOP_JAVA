package Models;

import java.util.Random;

public class Akustik extends Gitars{
	public Akustik() {
		super("Acoustic Guitar", null, null, null, null); 
		
		Random r = new Random (); 
		int randomNumber = r.nextInt(2); 
		String[] soundTypes = new String[]{
			"Warm", "Bright"
		}; 
		
		String soundType = soundTypes[randomNumber]; 
		this.setSoundType(soundType);
	}

}
 