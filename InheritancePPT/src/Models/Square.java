package Models;

public class Square extends BlockShaped {

	public Square(Integer panjang, Integer lebar) {
		super(panjang, lebar); 
	}
	
	public Integer keliling() {
		return 4 * this.getPanjang(); 
	}
	
	public Integer luas() {
		return this.getLebar() * this.getPanjang(); 
	}

}
