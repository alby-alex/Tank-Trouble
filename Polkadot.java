import java.awt.*;
/*****************************************************************
 * A Polkadot that maintains information about its position, diameter, radius, and color. A Polkadot
 * knows how to return its position, diameter, color, radius,  set its position,diameter, color, radius, jump, and draw itself.
 ****************************************************************/
public class Polkadot
{
   private double myX;
   private double myY;
   private double myDiameter;
   private Color myColor; 
   private double myRadius;
   /*************************************************************
    * Constructs a rectangle with initial position at (200,200), a diameter of 25, a red color, and a radius of 12.5.
    **************************************************************/
   public Polkadot()
   {
      myX = 200;
      myY = 200;
      myDiameter = 25;
      myColor = Color.RED;
      myRadius = myDiameter/2;
   }
   /*************************************************************
    * Constructs a rectangle with initial position at (x,y), a diameter of d, a color c, and a radius of d/2.
    * @param x    x coordinate
    * @param y    y coordinate
    * @param d    diameter
    * @param c    Color
    **************************************************************/
   public Polkadot(double x, double y, double d, Color c)
   {
      myX = x;
      myY = y;
      myDiameter = d;
      myColor = c;
      myRadius = d/2;
   }
   /***************************************************************
    * Returns the Polkadot's x coordinate
    * @return myX
    **************************************************************/
   public double getX() 
   { 
      return myX;
   }
   /***************************************************************
    * Returns the Polkadot's y coordinate
    * @return myY
    **************************************************************/
   public double getY()      
   { 
      return myY;
   }
   /***************************************************************
    * Returns the Polkadot's y diameter
    * @return myDiameter
    **************************************************************/
   public double getDiameter() 
   { 
      return myDiameter;
   }
   /***************************************************************
    * Returns the Polkadot's color
    * @return myColor
    **************************************************************/
   public Color getColor() 
   { 
      return myColor;
   }
   /***************************************************************
    * Returns the Polkadot's radius
    * @return myRadius
    **************************************************************/
   public double getRadius() 
   { 
      return myRadius;
   }
   /***************************************************************
    * Sets the x coordinate to this value
    * @param x    new x coordinate
    **************************************************************/
   public void setX(double x)
   {
      myX = x;
   }
   /***************************************************************
    * Sets the y coordinate to this value
    * @param y    new y coordinate
    **************************************************************/
   public void setY(double y)
   {
      myY = y;
   }
   /***************************************************************
    * Sets the color to this value
    * @param c   new color
    **************************************************************/
   public void setColor(Color c)
   {
      myColor = c;
   }
   /***************************************************************
    * Sets the diameter and radius to this value and this value/2.
    * @param d   new diameter
    **************************************************************/
   public void setDiameter(double d)
   {
      myDiameter = d;
      myRadius = d/2;
   }
   /***************************************************************
    * Sets the radius and diameter to this value/2 and this value.
    * @param r   new radius
    **************************************************************/
   public void setRadius(double r)
   {
      myRadius = r;
      myDiameter = 2*r;
   }
   /***************************************************************
    * It changes the position of the polkadot to a random location on the space.
    * @param rightEdge  the rightedge of the teleportable space
    * @param bottomEdge the bottom edge of the teleportable space
    **************************************************************/
   public void jump(int rightEdge, int bottomEdge)
   {
      myX = (Math.random()* (rightEdge-myDiameter) + myRadius);
      myY = (Math.random()* (bottomEdge-myDiameter) + myRadius);
   }
   /***************************************************************
    * It draws the polkadot onto a buffer.
    * @param myBuffer  the buffer to draw the polkadot onto
    **************************************************************/
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(myColor);
      myBuffer.fillOval((int)(getX() - getRadius()), (int)(getY()-getRadius()), (int)getDiameter(), (int)getDiameter());
   }
}
