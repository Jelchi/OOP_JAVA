package Utils;

import Model.Grocery;
import Model.Item;

import java.util.HashMap;

public class DisplayData {
    public static void displayGrocery(HashMap<String, Grocery> grocerys){
        for(Grocery grocery : grocerys.values()){
            displayGroceryDetail(grocerys, grocery.getGroceryid());
        }
    }

    public static void displayGroceryDetail(HashMap<String, Grocery> grocerys, String id){
        System.out.println("Grocery Detail Information");
        System.out.println("==========================================");
        System.out.println("Grocery ID: "+ grocerys.get(id).getGroceryid());
        System.out.println("Grocery Name: "+ grocerys.get(id).getName());
        System.out.println("Grocery Max: "+ grocerys.get(id).getMax());
        System.out.println("------------------------------------------");
        displayItems(grocerys.get(id).getItems());
    }

    public static void displayItems(HashMap<String, Item> items){
        for(Item item: items.values()){
            displayItemsDetail(items, item.getItemId());
        }
    }

    public static void displayItemsDetail(HashMap<String, Item> items, String id){
        System.out.println("Item Detail Information");
        System.out.println("==========================================");
        System.out.println("Item ID: "+ items.get(id).getItemId());
        System.out.println("Item Name: "+ items.get(id).getName());
        System.out.println("Item Brand Name: "+ items.get(id).getBrandName());
        System.out.println("Item Price: "+ items.get(id).getPrice());
        System.out.println("Item Quantity: "+ items.get(id).getQty());
        System.out.println("------------------------------------------");
    }
}
