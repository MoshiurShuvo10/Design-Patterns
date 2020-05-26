public class Item {
    private String itemName ;
    private int price ;
    private String barcode ;

    public Item(String itemName, int price, String barcode) {
        this.itemName = itemName;
        this.price = price;
        this.barcode = barcode;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public String getBarcode() {
        return barcode;
    }
}
