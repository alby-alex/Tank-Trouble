import java.awt.*;
/**********************************************************************
* A Tank is an abstract class that stores information universal to all   
* tanks, including things like HP, size, speed, and attack speed. It is 
* able to modify all of these methods.
*
*@author Alby, Tavo, Dhruv, and Muhurto 
***********************************************************************/
public abstract class Tank 
{
   private int myHP, myWidth, myHeight;
   private double myX, myY, mySpeed, myDX, myDY, myFireRate;
   /**********************************************************************
   *Constructs a tank with an initial speed, dy and dx, firerate, health points
   *size, and position
   *@param s   initial speed
   *@param dx  initial DX
   *@param dy  initial DY
   *@param f   initial firerate  
   *@param hp  initial health
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/
   public Tank(double s,double dx,double dy,double f,int hp,int w,int h,double x,double y)
   {
      mySpeed = s;
      myDX = dx;
      myDY = dy;
      myFireRate= f;
      myHP=hp;
      myWidth=w;
      myHeight=h;
      myX=x;
      myY=y;
   }
   /**********************************************************************
   *Constructs a tank with an initial speed, firerate, health points
   *size, and position
   *@param s   initial speed
   *@param f   initial firerate  
   *@param hp  initial health
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/

   public Tank(double s,double f,int hp,int w,int h,double x,double y)
   {
      mySpeed = s;
      myDX=1;
      myDY=1;
      myFireRate= f;
      myHP=hp;
      myWidth=w;
      myHeight=h;
      myX=x;
      myY=y;
   }
   
   public abstract void fire();
   /*************************************************************************
   *checks if current HP is = 0. If true then carry out the die() method
   *************************************************************************/
   
   public void checkHP()
   {
      if(myHP<=0)
      {
         die();
      }
   }
   /***************************************************************************
   * Returns the X position
   *@return myX
   ***************************************************************************/
   public double getX()
   {
      return myX;
   }
   /***************************************************************************
   * Returns the Y position
   *@return myY
   ***************************************************************************/
   public double getY()
   {
      return myY;
   }
   /***************************************************************************
   * Returns the Speed of the Tank
   *@return mySpeed
   ***************************************************************************/
   public double getSpeed()
   {
      return mySpeed;
   }
   /***************************************************************************
   * Returns the Firerate of the Tank
   *@return myFireRate
   ***************************************************************************/
   public double getFireRate()
   {
      return myFireRate;
   }
   /***************************************************************************
   * Returns the Width
   *@return myWidth
   ***************************************************************************/ 
   public int getWidth()
   {
      return myWidth;
   }
   /***************************************************************************
   * Returns the Height
   *@return myHeight
   ***************************************************************************/
   public int getHeight()
   {
      return myHeight;
   }
   /***************************************************************************
   * Draw the tank
   * @param myBuffer The buffer that the tank is to be drawn on
   ***************************************************************************/
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(Color.BLACK);
      myBuffer.fillRect((int)getX(), (int)getY(), getWidth(), getHeight());
   }
   /***************************************************************************
   * Returns the DX position
   *@return myDX
   ***************************************************************************/    
   public double getDX()
   {
      return myDX;
   }
   /***************************************************************************
   * Sets DX to the input number
   *@param x   assigns x to myDX
   ***************************************************************************/
   public void setDX(double x)
   {
      myDX=x;
   }
   /***************************************************************************
   * Returns the DY position
   *@return myDY
   ***************************************************************************/
   public double getDY()
   {
      return myDY;
   }
   /***************************************************************************
   * Sets DY to the input number
   *@param y   assigns y to myDY   
   ***************************************************************************/
   public void setDY(double y)
   {
      myDY = y;
   }
   /***************************************************************************
   * Sets the X position to the input number
   *@param x   assigns x to a myX
   ***************************************************************************/
   public void setX(double x)
   {
      myX=x;
   }
   /***************************************************************************
   * Sets the Y position to the input number
   *@param y   assigns y to a myY
   ***************************************************************************/
   public void setY(double y)
   {
      myY=y;
   }
   /***************************************************************************
   * Sets the Speed to the input number
   *@param s   assigns s to mySpeed
   ***************************************************************************/
   public void setSpeed(double s)
   {
      mySpeed=s;
   }
   /***************************************************************************
   * Sets the Firerate to the input number
   *@param f   assigns f to myFireRate
   ***************************************************************************/
   public void setFireRate(double f)
   {
      myFireRate=f;
   }
   /***************************************************************************
   * Sets the Width to the input number
   *@param w   assigns w to myWidth
   ***************************************************************************/
   public void setWidth(int w)
   {
      myWidth=w;
   }
   /***************************************************************************
   * Sets the Height to the input number
   *@param h   assigns h to myHeight
   ***************************************************************************/

   public void setHeight(int h)
   {
      myHeight = h;
   }
   /***************************************************************************
   * Checks if the Tank is colliding
   * @param dot checks if the polkadot collides with the tank
   *@return A boolean value that checks for collision
   ***************************************************************************/

   public boolean inTank(Polkadot dot)
   {
      for(int x = (int)getX(); x <= getX() + getWidth(); x++)  
         for(int y = (int)getY(); y <= getY() + getHeight(); y++)
            if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) 
               return true;            
      return false;
   }
   /***************************************************************************
   * Teleports the tank to outside the visible arena.
   ***************************************************************************/

   public void die()//we can change this 
   {
      setX(10000);
      setY(10000);
   }
   /***************************************************************************
   * Calculates the distances between two coordinates
   *@param x1  the first x coordinate
   *@param y1  the first y coordinate
   *@param x2  the second x coordinate
   *@param y2  the second y coordinate
   *@return the distance between the two coordinates
   ***************************************************************************/
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }	
}
