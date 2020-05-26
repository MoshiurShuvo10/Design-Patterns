
package ObserverPattern;

public interface Subject {
    
    public void RegisterObserver(Consumer consumer) ; 
    public void De_RegisterObserver(Consumer consumer) ; 
    public void notify_all_consumers() ; 
    
}
