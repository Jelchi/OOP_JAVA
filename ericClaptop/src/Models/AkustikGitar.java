package Models;

import java.util.Random;

public class AkustikGitar extends Gitars{
	
	public AkustikGitar() {
		super("Akustik" , null, null, null, null);
		 
		Random r = new Random(); 
		
		Integer randomNumber = r.nextInt(2);
		String[] soundTypes = new String[]{
			"Bright", "Warm"
		}; 
		
		String soundType = soundTypes[randomNumber]; 
		
		this.setSoundType(soundType);
	}
}
