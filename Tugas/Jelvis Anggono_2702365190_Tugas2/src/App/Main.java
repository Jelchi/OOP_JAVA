package App;

import Model.Grocery;
import Model.Item;
import Utils.DisplayData;
import Utils.GroceryManagement;
import Utils.ItemManagement;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.desktop.SystemEventListener;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, Grocery> grocerys = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opt;
        do{
            System.out.println("GROCERY STORES MANAGEMENT APPLICATION");
            System.out.println("====================================================");
            System.out.println("1. Insert New Grocery");
            System.out.println("2. Update Grocery");
            System.out.println("3. Insert Items");
            System.out.println("4. Update Items");
            System.out.println("5. Remove Items and Store");
            System.out.println("6. Exit");
            System.out.print(">> ");

            opt = input.nextInt();
            input.nextLine();

            switch(opt){
                case 1:
                    addNewGrocery();
                    break;

                case 2:
                    updateGrocery();
                    break;

                case 3:
                    addItems();
                    break;

                case 4:
                    updateItem();
                    break;

                case 5:
                    removeItems();
                    break;

                case 6:
                    System.out.println("Thank You");

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(opt != 6);
    }

    public static void addNewGrocery(){
        Scanner inputGrocery = new Scanner(System.in);

        System.out.print("Input Grocery ID: ");
        String groceryId = inputGrocery.nextLine();

        System.out.print("Input Grocery Name: ");
        String groceryName = inputGrocery.nextLine();

        System.out.print("Input Grocery Max: ");
        int groceryMax = inputGrocery.nextInt();

        GroceryManagement.addGrocery(grocerys, groceryId, groceryName, groceryMax);

    }

    public static void updateGrocery(){
        DisplayData.displayGrocery(grocerys);
        System.out.print("Seacrh ID: ");
        Scanner inputUpdateGrocery = new Scanner(System.in);
        String idToSearch = inputUpdateGrocery.nextLine();

        if(grocerys.containsKey(idToSearch)){
            System.out.print("Input Name: ");
            String nameToChange = inputUpdateGrocery.nextLine();
            GroceryManagement.updateGrocery(grocerys,idToSearch,nameToChange);
        } else {
            System.out.println("Data not founded");
        }
    }

    public static void addItems(){
        Scanner inputItem = new Scanner(System.in);

        System.out.print("Input Item ID: ");
        String itemId = inputItem.nextLine();

        System.out.print("Input Item Name: ");
        String itemName = inputItem.nextLine();

        System.out.print("Input Item Brand Name: ");
        String itemBrandName = inputItem.nextLine();

        System.out.print("Input Price: ");
        int itemPrice = inputItem.nextInt();
        inputItem.nextLine();

        System.out.print("Input Quantity: ");
        int itemQty = inputItem.nextInt();
        inputItem.nextLine();

        System.out.print("ID Grocery: ");
        String id1 = inputItem.nextLine();

        if(grocerys.containsKey(id1)){
            int total = 0;
            for (Item i : grocerys.get(id1).getItems().values()){
                total += i.getQty();
            }
            if (total + itemQty <= grocerys.get(id1).getMax()){
                ItemManagement.addItem(grocerys.get(id1).getItems(), itemId, itemName, itemBrandName, itemPrice, itemQty);
            } else {
                System.out.println("Grocery is full");
            }

        } else {
            System.out.println("Data Not founded");
        }

    }

    public static void updateItem() {
        DisplayData.displayGrocery(grocerys);
        System.out.print("Seacrh grocery: ");
        Scanner inputUpdateItems = new Scanner(System.in);
        String idToSearch2 = inputUpdateItems.nextLine();

        if(grocerys.containsKey(idToSearch2)){
            System.out.print("Search item: ");
            String idItemsUpdate = inputUpdateItems.nextLine();
            System.out.print("input Name Item to Update: ");
            String nameItemUpdate = inputUpdateItems.nextLine();
            System.out.print("Input name of brand Item to update: ");
            String brandItemUpdate = inputUpdateItems.nextLine();
            System.out.print("Input price Item to update: ");
            int priceUpdate = inputUpdateItems.nextInt();
            inputUpdateItems.nextLine();
            System.out.print("Input Quantity Item to update: ");
            int qtyUpdate = inputUpdateItems.nextInt();
            inputUpdateItems.nextLine();

            ItemManagement.updateItem(grocerys.get(idToSearch2).getItems(),idItemsUpdate, nameItemUpdate, brandItemUpdate, priceUpdate, qtyUpdate);
        } else{
            System.out.println("Data not founded");
        }

    }

    public static void removeItems(){
        Scanner inputRemove = new Scanner(System.in);

        int opt2;
        do{
            System.out.println("1. Remove Grocery");
            System.out.println("2. Remove Item");
            System.out.println("3. Exit");
            System.out.print(">> ");
            opt2 = inputRemove.nextInt();
            inputRemove.nextLine();

            switch(opt2){
                case 1:
                    String idGrocery;
                    System.out.print("Input Grocery Id want to remove: ");
                    idGrocery = inputRemove.nextLine();
                    GroceryManagement.deleteGrocery(grocerys, idGrocery);
                    break;

                case 2:
                    String idItem;
                    System.out.print("Input Items Id want to remove: ");
                    idItem = inputRemove.nextLine();

                    System.out.println("Input ID Iteam to Delete: ");
                    String i = inputRemove.nextLine();
                    ItemManagement.removeItem(grocerys.get(i).getItems(), idItem);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }while(opt2 != 3);
    }
}