package AdapterPattern;

public class Fan implements TwoPinPort{

    @Override
    public void Connect() {
        System.out.println("Connected : Two pin port --> Fan") ; 
    }
    
}
