package Apps;

import Models.Toko;
import Models.TokoBaju;
import Models.TokoMainan;

public class Main {
	public static void main(String[] args) {
		TokoBaju t = new TokoBaju("Hermes", 1000000 , "Pita Dasi"); 
		t.jualBeli();
		
		TokoMainan b = new TokoMainan("Mmm", 100, "Hotwheel");
		b.jualBeli();
	}
}
