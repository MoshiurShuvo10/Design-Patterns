
package AdapterPattern;

public class MAIN {
    
    public static void main(String[] args)
    {
        Fan fan = new Fan() ; 
        Mobile mobile = new Mobile() ; 
        Laptop laptop = new Laptop() ; 
        
        fan.Connect() ; 
        mobile.Connect(); 
        
        /* Can't write like this because class Laptop doesn't implements TwoPinPort Interface
        laptop.Connect() ; 
        
        So, to charge a laptop using TwoPortPin, we need an adapter which will convert 3-pin into a 2-pin...
        */
        ThreeIntoTwoPinAdapter three_into_two_pin_adapter = new ThreeIntoTwoPinAdapter(laptop) ; 
        three_into_two_pin_adapter.Connect();
    }
    
    
}
