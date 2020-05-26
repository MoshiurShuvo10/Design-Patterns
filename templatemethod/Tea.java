package templatemethod;
public class Tea extends Caffeine{

    @Override
    public void brew() {
        System.out.println("Steeping Tea bag into boiled water..") ; 
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon and ginger...") ; 
    }

    @Override
    public void confirmation() {
      System.out.println("Tea is serverd....") ; 
    }
    
}
