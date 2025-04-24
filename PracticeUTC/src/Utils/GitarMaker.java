package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Akustik;
import Models.Elektrik;
import Models.ElektrikAkustik;
import Models.Gitars;

public class GitarMaker {
	static ArrayList<Gitars> g = new ArrayList <>(); 
	
	public void mainMenu() {
		Scanner input = new Scanner(System.in); 
		
		int opt; 
		do {
			System.out.println("1. Buat Gitar");
			System.out.println("2. Tampilkan Daftar Gitar");
			System.out.println("3. Keluar");
			System.out.print("Choose Menu [1...3]: ");
			
			try {
				opt = input.nextInt(); 
			} catch(Exception e) {
				opt =0; 
			}
			input.nextLine(); 
			
			switch(opt) {
				case 1: 
					buatGitar(); 
					break ;
					
				case 2: 
					display(); 
					break; 
					
				case 3: 
					System.out.println("Terimakasih");
					break; 
					
				default: 
					System.out.println("Invalid input");
					break; 
			}
		}while(opt != 3); 
	}
	
	public void buatGitar() {
		Scanner input1 = new Scanner (System.in); 
		
		Gitars a; 
		 
		
		int opt1; 
		
		do {
			System.out.println("1. Acoustic");
			System.out.println("2. Electric");
			System.out.println("3. Acoustic Electric");
			System.out.print("Input gitar type[1...3}: ");
			
			try {
				opt1 = input1.nextInt(); 
			} catch(Exception e) {
				opt1 = 0; 
			}
			input1.nextLine();
			
			switch(opt1) {
				case 1: 
					a = new Akustik(); 
					break; 
					
				case 2: 
					a = new Elektrik(); 
					break; 
					
				case 3: 
					a = new ElektrikAkustik(); 
					break; 
					
				default: 
					a = null;
					break; 
			}
		}while(opt1 != 1 && opt1 != 2 && opt1 != 3); 
		g.add(a);
	}
	
	public void display() {
		System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volume]-[SwitchPosition]");
		for(int i=0; i< g.size(); i++) {
			 Gitars b = g.get(i); 
			
//			System.out.printf("%s - %s - %d - %d - %d\n", g.getType(), g.getSoundType(), g.getToneControl(), g.getVolumeControl(), g.getSwitchPosition());
			
			System.out.printf("%s - %s ", b.getGitarType(), b.getSoundType());
			
			if(b.getToneControl() != null) {
				System.out.printf("- %d", b.getToneControl());
			} else {
				System.out.print("- 0 ");
			}
			
			if(b.getVolumeControl()!= null) {
				System.out.printf("- %d", b.getVolumeControl());
			} else {
				System.out.print("- 0 ");
			}
			
			if(b.getSwitchPosition()!= null) {
				System.out.printf("- %d", b.getSwitchPosition());
			} else {
				System.out.print("- 0 ");
			}
			System.out.println(" ");
		}
	}
}
