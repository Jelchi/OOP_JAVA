package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Models.*;


public class GitarMaker {
	ArrayList<Gitars>gitars = new ArrayList<>(); 
	
	public void mainMenu() {		
		Scanner input = new Scanner(System.in); 
		Integer opt;
		do {
			System.out.println("1. Buat Gitar");
			System.out.println("2. Display List of Guitar");
			System.out.println("3. Exit");
			System.out.print("Choose menu[1...3]: ");
			try {
				opt = input.nextInt(); 
			} catch(Exception e) {
				opt = 0 ; 
			}
			input.nextLine(); 
			
			switch(opt) {
			case 1: 
				buatGitar(); 
				break; 
				
			case 2: 
				display(); 
				break; 
				
			case 3: 
				System.out.println("Terimakasih");
				break; 
				
			default: 
				System.out.println("Invalid Input");
				break; 
			}
		}while(opt != 3); 
	}
	
	public void buatGitar() {
		Scanner input1 = new Scanner(System.in); 
		
		Gitars d; 
		
		Integer opt2; 
		do {
			System.out.println("1. Accoustic");
			System.out.println("2. Electric");
			System.out.println("3. Accoustic Electric");
			System.out.println("Input guitar type[1...3]: ");
			try {
				opt2 = input1.nextInt(); 
			} catch(Exception e) {
				opt2 = 0; 
			}
			input1.nextLine(); 
			
			switch(opt2) {
				case 1: 
					d = new AkustikGitar(); 
					break; 
				
				case 2: 
					d = new Elektrik(); 
					break; 
				
				case 3: 
					d = new AkustikElectric(); 
					break; 
				default: 
					d = null; 
					System.out.println("Invalid Input");
			}
		}while(opt2 != 1 && opt2 != 2 && opt2 != 3); 
		
		gitars.add(d); 
	}
	
	public void display() {
		System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volume]-[SwitchPosition");
		for(int i=0; i< gitars.size(); i++) {
			Gitars g = gitars.get(i); 
			
//			System.out.printf("%s - %s - %d - %d - %d\n", g.getType(), g.getSoundType(), g.getToneControl(), g.getVolumeControl(), g.getSwitchPosition());
			
			System.out.printf("%s - %s ", g.getType(), g.getSoundType());
			
			if(g.getToneControl() != null) {
				System.out.printf("- %d", g.getToneControl());
			}
			
			if(g.getVolumeControl()!= null) {
				System.out.printf("- %d", g.getVolumeControl());
			}
			
			if(g.getSwitchPosition()!= null) {
				System.out.printf("- %d", g.getSwitchPosition());
			}
			System.out.println(" ");
		}
	}
}
