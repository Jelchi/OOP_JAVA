package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Document;

public class Manager {
	ArrayList<Document>docs =  new ArrayList<>(); 
	Integer capacity = 1024; 
	
	public Integer calculateCurrentSize() {
		Integer size = 0; 
		for(Document d : docs) {
			size+=d.getDocSize(); 
		}
		return size; 
	}
	
	public void showMenu() {
		Scanner input = new Scanner(System.in); 
		Integer opt=0;
		do {			
			System.out.println("HOV DOCUMENT MANAGER");
			System.out.println("============================");
			System.out.println("1. ADD DOCUMENT");
			System.out.println("2. LIST DOCUMENT");
			System.out.println("3. APPROVE DOCUMENT");
			System.out.println("4. EXIT");
			System.out.print(">> ");
			
			try {
				opt = input.nextInt(); 
			} catch(Exception e) {
				opt = 0; 
			}
			
			input.nextLine(); 
			
			
	
			switch (opt) {
				case 1: 
					addDocument(); 
					break; 
					
				case 2: 
					listDocument(); 
					break; 
					
				case 3: 
					approveDocument(); 
					break; 
					
				case 4: 
					System.out.println("Thank you");
					break; 
					
				default: 
					System.out.println("Invalid Input");
					break; 
			}
		}while(opt != 4); 
	}
	
	public void addDocument() {
		Scanner input2 = new Scanner(System.in);

        System.out.println("Register New Document");
        System.out.println("=========================================");

        String name;
        Integer size;
        Integer max = this.capacity -this.calculateCurrentSize(); 

        do{
            System.out.print("Input document name [1-50 characters]: ");
            name  = input2.nextLine();
        } while(name.length()<1 || name.length()>50);


        do{
            System.out.print("Input document size in MB[1-" +max+ "]: ");
            try {
            	size = input2.nextInt(); 
            }catch(Exception e) {
            	size = 0; 
            }
            input2.nextLine();
        } while(size<1 || size>max );
        
        docs.add(new Document (name, size, "Draft"));   
	}
	
	public void listDocument() {
		for(int i=0; i<docs.size(); i++) {
			Document d = docs.get(i); 
			System.out.printf("%d. %s %d MB %s\n",i+1, d.getDocName(), d.getDocSize(), d.getStatueDoc()); 
		}
	}
	
	public void approveDocument() {
		listDocument(); 
		
		Scanner scan = new Scanner(System.in); 
		int num; 
		do {
			System.out.print("Input document number to approve [1-"+ docs.size()+ "]: ");
            try {
            	num = scan.nextInt(); 
            } catch(Exception e) {
            	num =0; 
            }
            scan.nextLine();
		}while(num <1 || num > docs.size()); 
		
		Document d = docs.get(num-1); 
		
		if(!d.getStatueDoc().equals("Draft")) {
			System.out.println("Document must be draft");
			return; 
		}else {			
			d.setStatueDoc("Approve");
		}
		
	}
}
