package Model;

import java.util.HashMap;

public class Grocery {
    private final String groceryid;
    private String name;
    private final int max;
    private HashMap<String, Item> items;

   public Grocery(String groceryid, String name, int max){
       this.groceryid = groceryid;
       this.name = name;
       this.max = max;
       items = new HashMap<String, Item>();
   }

    public String getGroceryid() {
        return groceryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax() {
        return max;
    }

    public HashMap<String, Item> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Item> items) {
        this.items = items;
    }


}
