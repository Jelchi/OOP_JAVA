package Apps;

import java.util.Scanner;

import Models.Rectangle;
import Models.Square;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		System.out.print("Input panjang: ");
		
		Integer panjang = input.nextInt(); 
		input.nextLine(); 
		
		System.out.print("input lebar: ");
		Integer lebar = input.nextInt(); 
		input.nextLine();
		
		
		Square s = new Square(panjang, lebar); 
		Rectangle r = new Rectangle(panjang, lebar); 
		
		System.out.println("Luas square: " + s.luas());
		System.out.println("Keliling square: " + s.keliling());
		
		System.out.println("Keliling rectangle: "+r.keliling());
		System.out.println("Luas rectangle: " + r.luas());
		
		input.close(); 
	}

}
