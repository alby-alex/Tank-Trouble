 	/*****************************************************************
	* A Bumper is essentially a rectangle that knows its own x and y position, width, height, and color. 
   It can calculate whether a Polkadot object is touching or within itself.
	 
	* @author Dhruv Makwana 
	* @version 2.15.2018 
	****************************************************************/
import java.awt.*;
public class Bumper
{
   private int myX;
   private int myY;
   private int myWidth;
   private int myHeight;
   private Color myColor;
       /************************************************************* 
   * Constructs a Bumper with default values
   **************************************************************/
   public Bumper()     
   {
      myX = 30;
      myY = 125;
      myWidth = 20;
      myHeight = 150;
      myColor = Color.WHITE;     
   }
       /************************************************************* 
   * Constructs a rectangle with x and y positions specified by x and y, initial length and height specified by w and h, and color specified by c
   * @param x    initial x value
   * @param y    initial y value
   * @param w    initial width
   * @param h    initial height
   * @param c    initial color
   **************************************************************/
   public Bumper(int x, int y, int w, int h, Color c)
   {
      myX = x;
      myY = y;
      myWidth = w;
      myHeight = h;
      myColor = c;
   }
       /*************************************************************** 
      * Returns the Bumper's x
      * @return	 x
      **************************************************************/
   public int getX()
   {
      return myX;
   }
       /*************************************************************** 
      * Returns the Bumper's y
      * @return	 y
      **************************************************************/
   public int getY()
   {
      return myY;
   } 
       /*************************************************************** 
      * Returns the Bumper's width
      * @return	 width
      **************************************************************/
   public int getWidth()
   {
      return myWidth;
   }
       /*************************************************************** 
      * Returns the Bumper's height
      * @return	 height
      **************************************************************/
   public int getHeight()
   {
      return myHeight;
   }/*************************************************************** 
      * Returns the Bumper's color
      * @return	 color
      **************************************************************/
   public Color getColor()
   {
      return myColor;
   }
       /***************************************************************
      * Sets the x to the input number.
      * @param x	 assigns x to myX
      **************************************************************/
   public void setX(int x)
   {
      myX = x;
   }
       /***************************************************************
      * Sets the y to the input number.
      * @param y	 assigns y to myY
      **************************************************************/
   public void setY(int y)
   {
      myY = y;
   } 
       /***************************************************************
      * Sets the myWidth to the input number.
      * @param w	 assigns w to myWidth
      **************************************************************/
   public void setWidth(int w)
   {
      myWidth = w;
   }
       /***************************************************************
      * Sets the h to the input number.
      * @param h	 assigns h to myHeight
      **************************************************************/
   public void setHeight(int h)
   {
      myHeight = h;
   }/***************************************************************
      * Sets the c to the input number.
      * @param c	 assigns c to myColor
      **************************************************************/
   public void setColor(Color c)
   {
      myColor = c;
   }
       /***************************************************************
      * Movves the bumper to a random location in the map
      * @param rightEdge   used to make sure Bumper isn't outside of map
      * @param bottomEdge   used to make sure Bumper isn't outside of map
      **************************************************************/
   public void jump(int rightEdge, int bottomEdge)
   {
      myX = (int) (Math.random() * (rightEdge - getWidth()));
      myY = (int) (Math.random() * (bottomEdge - getHeight()));      
   }
       /***************************************************************
      * Draws the Bumper
      * @param myBuffer    used to allow usage of Graphics components
      **************************************************************/
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(getColor());
      myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
   }   
       /***************************************************************
      * Checks if dot is touching or inside the Bumper
      * @param dot   Polkadot that is checked
       * @return if the polkadot is in the bumper
      **************************************************************/
   public boolean inBumper(Polkadot dot)
   {
      for(int x = getX(); x <= getX() + getWidth(); x++)  
         for(int y = getY(); y <= getY() + getHeight(); y++)
            if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() )
               return true;            
      return false;
   }  
       /***************************************************************
      * Calculates distance between (x1,y1) and (x2,y2)
      * @param x1    x coordinate of point 1
      * @param x2    x coordinate of point 2
      * @param y1    y coordinate of point 1
      * @param y2    y coordinate of point 2
      *@return the distance between the points
      **************************************************************/
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }	
}
