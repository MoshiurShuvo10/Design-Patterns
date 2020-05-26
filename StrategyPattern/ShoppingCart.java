import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart(List<Item> items) {
        this.itemList = items;
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public void removeItem(Item item){
        this.itemList.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : itemList){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
