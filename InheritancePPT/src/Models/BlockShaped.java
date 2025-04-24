package Models;

public class BlockShaped {
	private Integer panjang; 
	private Integer lebar; 
	
	public BlockShaped(Integer panjang, Integer lebar) {
		super(); 
		this.panjang = panjang; 
		this.lebar = lebar; 
	}

	public Integer getPanjang() {
		return panjang;
	}

	public void setPanjang(Integer panjang) {
		this.panjang = panjang;
	}

	public Integer getLebar() {
		return lebar;
	}

	public void setLebar(Integer lebar) {
		this.lebar = lebar;
	}
	
}
