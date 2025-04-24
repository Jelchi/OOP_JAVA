package Models;

public abstract class Toko {
	private String namaProduct; 
	private Integer jumlahProduct; 
	
	public Toko(String namaProduct, Integer jumlahProduct) {
		this.namaProduct = namaProduct;
		this.jumlahProduct = jumlahProduct; 
	}
	
	public abstract void jualBeli(); 

}
