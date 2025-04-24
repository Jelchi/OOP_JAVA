package Models;

import java.util.Scanner;

public class Elektrik extends  Gitars{

	public Elektrik() {
		super("Elektik", null, null, null, null); 
		
		Scanner input = new Scanner(System.in); 
		
		String soundType; 
		Integer tone; 
		Integer volume;
		Integer switchPosition; 
		
		do{
			System.out.println("Input Switch position[1..4]: ");
			try {
				switchPosition =  input.nextInt(); 
			} catch(Exception e) {
				switchPosition = -1; 
			}
			input.nextLine(); 
		} while(switchPosition != 1 && switchPosition !=2 && switchPosition !=3 && switchPosition !=4); 
		
		do {
			System.out.println("Input tone: ");
			try {
				tone = input.nextInt();
			}catch(Exception e) {
				tone = -1; 
			}
			input.nextLine(); 
		}while(tone < 0); 
		
		do {
			System.out.println("Input volume: ");
			try {
				volume = input.nextInt(); 
			} catch(Exception e) {
				volume = -1; 
			}
			input.nextLine(); 
		} while (volume <0); 
		
		switch(switchPosition) {
			 case 1: 
				 soundType = "Funk"; 
				 break; 
				 
			 case 2: 
				 soundType = "Jazz"; 
				 break; 
				 
			 case 3: 
				 soundType = "Blue"; 
				 break; 
				 
			 case 4: 
				 soundType = "Rock"; 
				 break; 
				 
			default: 
				soundType = null; 
				break; 
		}
	
		this.setSoundType(soundType);
		this.setVolumeControl(volume);
		this.setToneControl(tone);
		this.setSwitchPosition(switchPosition);
	}

}
