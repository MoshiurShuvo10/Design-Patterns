
package FlyweightPattern;

import java.util.HashMap;

public class CircleFactory {
    
    private static void ForceDelay()
    {
        try
        {
           Thread.sleep(2000) ; 
        }
        catch(InterruptedException ex)
        {
            System.out.println("Thread interrupted"); 
        }
    }
    
    private static int counter = 0 ; 
    private HashMap<String , Shape> circleMap = new HashMap<>() ; 
    
    public Shape getShape(String Color)
    {
        Shape shape = null ; 
        if(circleMap.containsKey(Color))
            shape = circleMap.get(Color) ; 
        else
            
        {
            ++counter ; 
            switch(Color)
            {
                case "Red":
                    System.out.println("Creating Red Circle") ; 
                    ForceDelay() ; 
                    shape = new Circle(Color) ; 
                    System.out.println("Red Circle Created") ;
                    break ; 
                    
                 case "Green":
                    System.out.println("Creating Green Circle") ; 
                    ForceDelay() ; 
                    shape = new Circle(Color) ; 
                    System.out.println("Green Circle Created") ;
                    break ; 
                    
                 case "Blue":
                    System.out.println("Creating Blue Circle") ; 
                    ForceDelay() ; 
                    shape = new Circle(Color) ; 
                    System.out.println("Blue Circle Created") ;
                    break ; 
                    
                 case "Yellow":
                    System.out.println("Creating Yellow Circle") ; 
                    ForceDelay() ; 
                    shape = new Circle(Color) ; 
                    System.out.println("Yellow Circle Created") ;
                    break ;    
                    
                 default:
                     System.out.println("unreachable code") ; 
            }

            
        }
        
        circleMap.put(Color, shape) ; 
        return shape ; 
        
    }
    
    public static void printTotalObjects() { System.out.println("Total objects created : "+counter); }
}
