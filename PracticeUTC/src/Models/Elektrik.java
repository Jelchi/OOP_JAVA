package Models;

import java.util.Scanner;

public class Elektrik extends Gitars{

	public Elektrik() {
		super("Electric Guitar", null, null, null, null); 
		
		Scanner input = new Scanner(System.in);
		
		String soundType;
		Integer tone; 
		Integer volume; 
		Integer switchPosition; 
		
		do {
			System.out.print("Input switch position: ");
			try {
				switchPosition = input.nextInt(); 
			}catch(Exception e) {
				switchPosition = 0; 
			}
			
			input.nextLine(); 
		}while(switchPosition > 4); 
		
		do {
			System.out.print("Input tone: ");
			try {
				tone = input.nextInt(); 
			}catch(Exception e) {
				tone = 0; 
			}
			input.nextLine(); 
		}while(tone < 0); 
		
		do {
			System.out.print("Input volume: ");
			try {
				volume = input.nextInt(); 
			} catch(Exception e) {
				volume = 0; 
			}
			
			input.nextLine();
		}while(volume <0); 
		
		switch(switchPosition) {
			case 1: 
				soundType = "Funk"; 
				break; 
				
			case 2: 
				soundType = "Jazz"; 
				break; 
			
			case 3: 
				soundType = "Blues"; 
				break; 
			
			case 4: 
				soundType = "Rock"; 
				break; 
				
			default: 
				soundType = null; 
				break; 
		}
		
		this.setSoundType(soundType);
		this.setToneControl(tone);
		this.setVolumeControl(volume);
		this.setSwitchPosition(switchPosition);
	}

}
