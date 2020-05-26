import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("shaban",100,"aljsdalfj");
        Item item2 = new Item("tel",200,"aljsdalfj");
        Item item3 = new Item("toothpaste",10,"aljsdalfj");
        Item item4 = new Item("moshar coil",300,"aljsdalfj");

        List<Item> items = new ArrayList<>() ;
        ShoppingCart shoppingCart = new ShoppingCart(items);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);

        shoppingCart.pay(new PaypalStrategy("shuvorm87@gmail.com","tore komu ken?"));
        shoppingCart.pay(new CreditCardStrategy("moshiur Rahman","r3432432144","DBBL","22-05-02060"));
    }
}
