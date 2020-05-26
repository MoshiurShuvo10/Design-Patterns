
package AdapterPattern;

public class Mobile implements TwoPinPort{

    @Override
    public void Connect() {
        System.out.println("Connected Two pin port --> Mobile") ; 
    }
    
}
