import Model.Document;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Document> doc = new ArrayList<>();
    static double capacity = 1024;
    static double curr = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opt;
        do{
            System.out.println("Hov Document Manager");
            System.out.println("==================================================");
            System.out.println("Available Storage: " + curr + " MB / " + capacity + " MB");

            System.out.println("1) Register New Document");
            System.out.println("2) View All Documents");
            System.out.println("3) Approve Document");
            System.out.println("4) Exit");
            System.out.print(">> ");
            opt = input.nextInt();
            input.nextLine();

            switch (opt){
                case 1:
                    registerNewDocument();
                    break;

                case 2:
                    veiwAllDocument();
                    break;

                case 3:
                    approveDocument();
                    break;

                case 4:
                    System.out.println("Thank you for using this application!");
                    break;

                default:
                    System.out.println("Invalid Statement");
                    break;
            }
        }while(opt != 4);
    }

    public static void registerNewDocument(){
        Scanner input2 = new Scanner(System.in);

        System.out.println("Register New Document");
        System.out.println("=========================================");

        String name;
        double size;

        do{
            System.out.print("Input document name [1-50 characters]: ");
            name  = input2.nextLine();
        } while(name.length()<1 || name.length()>50);


        do{
            System.out.print("Input document size in MB[1-740]: ");
            size  = input2.nextInt();
            input2.nextLine();
        } while(size<1 || size>740);


        if(getTotalSize() + size <= capacity){
            Document d = new Document(name, size);
            doc.add(d);
            System.out.println("Success input document data!");
            curr += size;
        } else {
            System.out.println("There is not enough storage space.");
        }
    }

    public static void veiwAllDocument(){
        if(doc.isEmpty()){
            System.out.println("Data is Empty");
        }

        int i = 0;
        System.out.println("View All Documents");
        System.out.println("==============================================");
        for(Document d : doc){
            i+=1;
            System.out.print(i+". ");
            System.out.println(d.getNameDoc()+" ("+d.getSizeDoc()+" MB) - "+ d.getStatus());
        }
    }

    public static void approveDocument(){
        veiwAllDocument();

        Scanner input3 = new Scanner(System.in);
        int num;
        do{
            System.out.print("Input document number to approve [1-"+ doc.size()+ "]: ");
            num= input3.nextInt();
            input3.nextLine();
        }while(num<1 || num>doc.size());

        Document dokumen = doc.get(num - 1);
        
        if (dokumen.getStatus().equals("Draft")) {
            dokumen.setStatus("Approved");
            System.out.println("Success approve: "+dokumen.getNameDoc());
        } else {
            System.out.println("The document is alreeady approved");
        }
    }

    public static double getTotalSize(){
        double total = 0;
        for(Document d : doc){
            total+=d.getSizeDoc();
        }
        return total;
    }
}