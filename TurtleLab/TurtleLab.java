import java.awt.Color;

public class TurtleLab
{
     public static void main(String[] args)
    {
        World turtleWorld = new World(500,500);
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.red);
        turtle.setPenWidth(10);
        
        turtle.penUp();
        turtle.moveTo(5,495);
        turtle.penDown();
        turtle.turnRight();
        turtle.forward(490);
        
        int turtleY = 0;
        
        while (turtleY > 0)
        {
            
        }
        
    }
}