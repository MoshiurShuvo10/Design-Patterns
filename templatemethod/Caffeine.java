package templatemethod;

public abstract class Caffeine {
    public final void Prepare()
    {
        boilWater(); 
        brew() ; 
        pourInCup() ; 
        if(customerWantsCondiments())
            addCondiments() ; 
        confirmation() ; 
    }
    
    public void boilWater()
    {
        System.out.println("Boiling Water..") ; 
    }
    public abstract void brew() ; 
    public abstract void confirmation() ; 
    
    public void pourInCup()
    {
        System.out.println("Pouring in Cup..") ; 
    }
    
    public abstract void addCondiments() ; 
    
    public boolean customerWantsCondiments() { return true ; } ; 
    
    
}
