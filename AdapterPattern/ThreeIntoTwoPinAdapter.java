
package AdapterPattern;

public class ThreeIntoTwoPinAdapter implements TwoPinPort{
    Laptop laptop ; 
    public ThreeIntoTwoPinAdapter(Laptop laptop)
    {
        this.laptop = laptop ; 
    }

    @Override
    public void Connect() {
      System.out.println("\nAdapter used. Converting Three Pin into Two pin..") ; 
      System.out.println("Connected into TwoPinPort");
      laptop.ChargeLaptop();
    }
    
    
    
}
