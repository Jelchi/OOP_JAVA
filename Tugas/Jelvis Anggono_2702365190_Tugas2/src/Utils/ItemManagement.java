package Utils;

import Model.Item;

import java.util.HashMap;

public class ItemManagement {
    public static void addItem(HashMap<String, Item>items, String id, String name, String brandName, int price, int qty){
        if(items.isEmpty()){
            items.put(id, new Item(id, name, brandName, price, qty));
        } else {
            if(!items.containsKey(id)){
                items.put(id, new Item(id, name, brandName, price, qty));
            } else {
                System.out.println("Data has been input");
            }
        }

    }

    public static void removeItem(HashMap<String, Item> items, String id){
        if(items.containsKey(id)){
            items.remove(id);
        } else {
            System.out.println("Data not founded");
        }
    }

    public static void updateItem(HashMap<String, Item> items, String id, String name, String brandName, int price, int qty){
        if(items.containsKey(id)){
            Item item =  items.get(id);
            items.get(id).setName(name);
            items.get(id).setBrandName(brandName);
            items.get(id).setPrice(price);
            items.get(id).setQty(qty);
        } else {
            System.out.println("Data not founded");
        }
    }

}
