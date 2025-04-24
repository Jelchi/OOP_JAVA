package App;

import Models.Jurusan;
import Models.PPTI17;
import Models.PPTI18;

public class Main {
	public static void main(String[] args) {
		
		Jurusan j = new Jurusan(34, "PPTI 17");
		PPTI17 a = new PPTI17(35, "PPTI 17");
		j.belajar();
		a.belajar();
		
		PPTI18 b = new PPTI18(34, "PPTI 18"); 
		b.belajar();
	}
}
