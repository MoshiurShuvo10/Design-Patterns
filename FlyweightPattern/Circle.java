
package FlyweightPattern;

public class Circle implements Shape {
    
    private String color ; 
    private int x_coordinate ; 
    private int y_coordinate ;
    private int radius ; 
    
    public Circle(String color)
    {
        this.color = color ; 
    }
    
    public void set_radius(int radius) { this.radius = radius ; }
    public void set_x_coordinate(int x_coordinate) { this.x_coordinate = x_coordinate ; }
    public void set_y_coordinate(int y_coordinate) {this.y_coordinate = y_coordinate ; }        
    
    public String getColor() { return color ; }
    public int get_x_coordinate() { return x_coordinate ; }
    public int get_y_coordinate() { return y_coordinate ; }
    public int get_radius() { return radius ; }

    @Override
    public void draw() {
       System.out.println("Circle: "+color+"\nradius: "+radius+"\nx: "+x_coordinate+"\ny: "+y_coordinate+"\n") ; 
    }
    
}
