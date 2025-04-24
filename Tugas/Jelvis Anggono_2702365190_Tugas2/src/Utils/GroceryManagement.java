package Utils;

import Model.Grocery;
import Model.Item;

import java.util.HashMap;

public class GroceryManagement {
    public static void addGrocery(HashMap<String, Grocery> grocerys, String id, String name, int max){
        if(grocerys.isEmpty()){
            grocerys.put(id, new Grocery(id, name, max));
        } else {
            if(!grocerys.containsKey(id)){
                grocerys.put(id, new Grocery(id, name, max));
            } else {
                System.out.println("Data has been input");
            }
        }
    }

    public static void deleteGrocery(HashMap<String, Grocery> grocerys, String id){
        if(grocerys.containsKey(id)){
            grocerys.remove(id);
        } else {
            System.out.println("Data not founded");
        }
    }

    public static void updateGrocery(HashMap<String, Grocery> grocerys, String id, String name){
        if(grocerys.containsKey(id)){
            Grocery grocery = grocerys.get(id);
            grocerys.get(id).setName(name);
        } else {
            System.out.println("Data not founded");
        }
    }
}
