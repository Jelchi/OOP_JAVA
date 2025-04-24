package Models;

import Apps.TukarTambah;

public class TokoMainan extends Toko implements TukarTambah{
	private String kategoriMainan;
	
	public TokoMainan(String namaProduct, Integer jumlahProduct, String kategoriMainan) {
		super(namaProduct, jumlahProduct); 
		this.kategoriMainan = kategoriMainan; 
	}

	@Override
	public void jualBeli() {
		System.out.println("Mainan yang ke jual "+ kategoriMainan);
	}
	
	@Override
	public void tukerTambah() {
		
	}
	
	@Override
	public void tukerTambah2() {
		
	}
}
