package Models;

public class Rectangle extends BlockShaped {

	public Rectangle(Integer panjang, Integer lebar) {
		super(panjang, lebar); 
	}
	
	public Integer keliling() {
		return 2*(this.getPanjang() + this.getLebar()); 
	}
	
	public Integer luas() {
		return this.getLebar() * this.getPanjang(); 
	}
}
