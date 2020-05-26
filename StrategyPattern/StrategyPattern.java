public interface PaymentStrategy{
    public void pay(int amount); 
}

public class CreditCardStratedy implements PaymentStrategy{

    private String name ; 
    private String cardNumber ; 
    private String bankName ;
    private String expiryDate ;

    public CreditCardStratedy(String name,String cardNumber,String bankName,String expiryDate){
        this.name = name ; 
        this.cardNumber = cardNumber ; 
        this.bankName = bankName ; 
        this.expiryDate =expiryDate; 
    }
    @Override
    public void pay(int amount){
        System.out.println("Taka "+amount+" is paid with Credit Card") ; 
        System.out.println("Card Holder Name: "+this.name);
        System.out.println("Card Number: "+this.cardNumber);
        System.out.println("Bank: "+this.bankName);
        System.out.println("Date of Expiry: "+this.expiryDate);
    }
}

public class PaypalStrategy implements PaymentStrategy{
    private String email ; 
    private String password ; 

    public PaypalStrategy(String email,String password){
        this.email = email ; 
        this.password = password ; 
    }

    @Override
    public void pay(int amount){
        System.out.println(amount+" paid with paypal");
        System.out.println("Email: "+this.email) ; 
    }
}



