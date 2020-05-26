package ObserverPattern;

public class CurrentScoreDisplay implements Consumer{
    
    private int runs ; 
    private double overs ; 
    private int wickets ; 
   

    @Override
    public void Register_me_with(Subject subject) {
        subject.RegisterObserver(this);
    }

    @Override
    public void De_register_me_from(Subject subject) {
       subject.De_RegisterObserver(this);
    }

    @Override
    public void update(int runs, int wickets, double overs) {
     this.runs = runs ; this.wickets = wickets ; this.overs = overs ; 
       display() ; 
    }


    public void display()
    {
        System.out.println( "Runs: "+runs+"\nWickets: "+wickets+"\nOvers: "+overs+"\n") ;
    }
    
   
    
}
