package templatemethod;

import java.util.Scanner;

public class Coffee extends Caffeine{
    
    Scanner input = new Scanner(System.in) ; 

    @Override
    public void brew() {
        System.out.println("Brewing Coffee...") ; 
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and sugar...") ; 
    }
    
    public boolean customerWantsCondiments()
    {
        System.out.println("Do you want to add any condiments? ");
        String decision = input.nextLine() ; 
         
         return decision.toLowerCase().startsWith("yes") ; 
    }

    @Override
    public void confirmation() {
        System.out.println("Coffee is served...") ; 
    }
    
}
