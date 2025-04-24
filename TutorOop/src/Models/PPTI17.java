package Models;

public class PPTI17 extends Jurusan{

	public PPTI17(Integer jumlahAnak, String namaKelas) {
		super(jumlahAnak, namaKelas);
	}
	
	@Override
	public void belajar() {
		System.out.println("Ga ada kelas");
	}

}
