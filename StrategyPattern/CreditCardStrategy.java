public class CreditCardStrategy implements PaymentStrategy{

    private String name ;
    private String cardNumber ;
    private String bankName ;
    private String expiryDate ;

    public CreditCardStrategy(String name,String cardNumber,String bankName,String expiryDate){
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