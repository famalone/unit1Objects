import java.awt.Color;

public class TurtleLab
{
     public static void main(String[] args)
    {
        World turtleWorld = new World(500,500);
        
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.red);
        turtle.setPenWidth(10);
        
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.blue);
        turtle2.setPenWidth(10);
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.yellow);
        turtle3.setPenWidth(15);
        
        turtle2.penUp();
        turtle2.moveTo(5,5);
        turtle2.turnRight();
        turtle2.turnRight();
        turtle2.penDown();
        turtle2.forward(490);
        
        turtle.penUp();
        turtle.moveTo(5,495);
        turtle.penDown();
        turtle.turnRight();
        turtle.forward(490);
        
        int turtleY = turtle.getYPos();
        //adds the red and green lines
        while (turtleY > 0)
        {
            turtle.penUp();
            turtle.setPenColor(Color.green);
            turtle.turnLeft();
            turtle.forward(10);
            turtle.turnLeft();
            turtle.penDown();
            turtle.forward(490);
            
            turtle.penUp();
            turtle.turnRight();
            turtle.forward(10);
            turtle.turnRight();
            turtle.setPenColor(Color.red);
            turtle.penDown();
            turtle.forward(490);
            
            turtleY = turtle.getYPos();
        }
        
        int turtle2X = turtle2.getXPos();
        
        //adds the blue lines
        while(turtle2X < 490)
        {
            turtle2.penUp();
            turtle2.turnLeft();
            turtle2.forward(20);
            turtle2.turnLeft();
            turtle2.penDown();
            turtle2.forward(490);
            
            turtle2.penUp();
            turtle2.turnRight();
            turtle2.forward(20);
            turtle2.turnRight();
            turtle2.penDown();
            turtle2.forward(490);
            
            turtle2X = turtle2.getXPos();
        }
        
        //Adding my name to the pattern
        
        turtle3.penUp();
        turtle3.moveTo(100,350);
        turtle3.penDown();
        turtle3.forward(200);
        turtle3.turnRight();
        turtle3.forward(100);
        turtle3.penUp();
        turtle3.moveTo(100,250);
        turtle3.penDown();
        turtle3.forward(75);
        
        turtle3.penUp();
        turtle3.moveTo(250,350);
        turtle3.turnLeft();
        turtle3.penDown();
        turtle3.forward(100);
        turtle3.penUp();
        turtle3.forward(50);
        turtle3.penDown();
        turtle3.forward(5);
        
        turtle3.penUp();
        turtle3.moveTo(325,350);
        turtle3.penDown();
        turtle3.forward(100);
        turtle3.moveTo(400,350);
        turtle3.forward(100);
    }
}