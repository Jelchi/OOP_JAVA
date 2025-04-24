package Models;

import Apps.TukarTambah;

public class TokoBaju extends Toko implements TukarTambah{
	private String jenisBaju; 

	public TokoBaju(String namaProduct, Integer jumlahProduct, String jenisBaju) {
		super(namaProduct, jumlahProduct);
		this.jenisBaju = jenisBaju; 
	}

	@Override
	public void jualBeli() {
		System.out.println("Anda menjual baju " + jenisBaju);
	}
	
	@Override
	public void tukerTambah() {
		
	}
	
	@Override
	public void tukerTambah2() {
		
	}
}
