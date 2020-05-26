
package ObserverPattern;

public interface Consumer {
    
    public void Register_me_with(Subject subject) ; 
    public void De_register_me_from(Subject subject) ; 
    public void  update(int runs,int wickets,double overs) ; 
   
}
