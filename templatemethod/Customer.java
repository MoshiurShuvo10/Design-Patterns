
package templatemethod;

public class Customer {
    public static void main(String[] args)
    {
        Caffeine caffeine = new Coffee() ; 
        System.out.println("Serving Coffee...");
        caffeine.Prepare(); 
        System.out.println("\nServing Tea...") ;
        caffeine = new Tea() ; 
        caffeine.Prepare(); 
    }
}
