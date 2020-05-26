
package ObserverPattern;

public class PredictedScoreDisplay implements Consumer{
    
    private double run_rate ; 
    private int predicted_score ; 
    

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
       run_rate = runs/overs ; 
       predicted_score = (int)(run_rate * 50) ;   
       display() ; 
    }
    
    public void display()
    {
        System.out.println( "Run Rate: "+run_rate+"\nPredicted Score: "+predicted_score+"\n") ; 
    }
    
}
