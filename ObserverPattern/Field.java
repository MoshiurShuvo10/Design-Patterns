package ObserverPattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Field implements Subject{
    
    Scanner input = new Scanner(System.in) ; 
    private int runs ; 
    private int wickets ; 
    private double overs ; 
    private ArrayList<Consumer> consumer_list ;
    
    public Field()
    {
        consumer_list = new ArrayList<>() ; 
    }
    @Override
    public void RegisterObserver(Consumer consumer) {
        consumer_list.add(consumer) ;       
    }
    @Override
    public void De_RegisterObserver(Consumer consumer) {
        int index = consumer_list.indexOf(consumer) ; 
        if(index >= 0)
            consumer_list.remove(consumer) ;        
    }
    @Override
    public void notify_all_consumers() {
        
        Iterator<Consumer> iterator = consumer_list.iterator() ; 
        while(iterator.hasNext())
        {
            Consumer consumer = iterator.next() ; 
            consumer.update(runs, wickets, overs);   
        }     
    }    
    public void hasChanged()
    {
        System.out.println("Runs: ") ; 
        runs = input.nextInt() ; 
        
        System.out.println("Wickets: ") ;
        wickets = input.nextInt() ; 
        
        System.out.println("Overs: ") ;
        overs = input.nextInt() ; 
        
        notify_all_consumers() ; 
    }   
}
