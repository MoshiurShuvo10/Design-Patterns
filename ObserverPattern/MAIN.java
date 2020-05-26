package ObserverPattern;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args)
    {   Scanner input = new Scanner(System.in) ; 
        Field field = new Field() ; 
        CurrentScoreDisplay current_score_display = new CurrentScoreDisplay() ; 
        PredictedScoreDisplay predictedScoreDisplay = new PredictedScoreDisplay() ;      
        current_score_display.Register_me_with(field);
        predictedScoreDisplay.Register_me_with(field);
        System.out.println("Initial Score: ") ; 
       current_score_display.display() ; 
       predictedScoreDisplay.display() ;        
        System.out.println("Want to update Scores?") ; 
        String decision = input.nextLine() ; 
        if(decision.startsWith("no"))
        {
            System.out.println("Thank you.\nProgram terminated") ; 
            return ; 
        }  else if(decision.startsWith("yes"))
        {   while(true)
           {
               field.hasChanged();
               System.out.println("Want to De Register any consumers? ") ;
               decision = input.nextLine() ; 
               if(decision.equalsIgnoreCase("yes"))
               {
                   System.out.println("Consumer Name: ") ; 
                   decision = input.nextLine() ; 
                   if(decision.startsWith("current"))
                       current_score_display.De_register_me_from(field);
                   else if(decision.startsWith("predic"))
                       predictedScoreDisplay.De_register_me_from(field);
               }               
               System.out.println("Want to  Register any consumers? ") ;
               decision = input.nextLine() ; 
               if(decision.equalsIgnoreCase("yes"))
               {
                   System.out.println("Consumer Name: ") ; 
                   decision = input.nextLine() ; 
                   if(decision.startsWith("current"))
                       current_score_display.De_register_me_from(field);
                   else if(decision.startsWith("predic"))
                      predictedScoreDisplay.Register_me_with(field);
               }
              System.out.println("Want further update?") ; 
              decision = input.nextLine() ; 
              if(decision.equalsIgnoreCase("no"))
                break ; 
           }
        }
        System.out.println("Program terminated successfully") ; 
    }   
}
