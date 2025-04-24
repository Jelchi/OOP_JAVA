package Model;

public class Item {
    private final String itemId;
    private String name;
    private String brandName;
    private int price;
    private int qty;

    public Item(String itemId, String name, String brandName, int price, int qty) {
        this.itemId = itemId;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.qty = qty;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
