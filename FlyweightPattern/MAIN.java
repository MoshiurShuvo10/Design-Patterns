package FlyweightPattern;

import java.security.SecureRandom;

public class MAIN {
    private static String[] colorList = {"Red","Green","Blue","Yellow"} ;
    
    public static String getRandomColor()
    {
        SecureRandom secureRandom = new SecureRandom() ; 
        int index = secureRandom.nextInt(colorList.length) ;
        return colorList[index] ; 
    }
    
    public static int getRandomNumber()
    {
        return (int)(Math.random()*10) ; 
    }
    
    public static void main(String[] args)
            
    {
        CircleFactory circleFactory = new CircleFactory() ; 
        for(int i = 0 ; i < 10 ; i++)
        {
        Circle circle = (Circle)circleFactory.getShape(getRandomColor());
        circle.set_radius(getRandomNumber()) ;
        circle.set_x_coordinate(getRandomNumber()) ; 
        circle.set_y_coordinate(getRandomNumber()) ; 
        circle.draw() ;
        }
       
       CircleFactory.printTotalObjects() ; 
    }
    
}
