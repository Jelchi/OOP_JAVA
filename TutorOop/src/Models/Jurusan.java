package Models;

public class Jurusan {
	private Integer jumlahAnak;
	private String namaKelas; 
	
	public Jurusan(Integer jumlahAnak, String namaKelas) {
		super(); 
		this.jumlahAnak = jumlahAnak; 
		this.namaKelas = namaKelas; 
	}

	public void belajar() {
		System.out.println("Kelas: " + namaKelas +" (" +jumlahAnak+")");
	}
}
