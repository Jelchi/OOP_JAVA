package HOV;

import Utils.Manager;

public class Apps {
	public static void main(String[] args) {
		Manager docManager = new Manager(); 
		docManager.showMenu();  
		
		docManager.listDocument();
		
		docManager.approveDocument();
	}
}
