/*****************************************************************
	* The BombShell inherits all methods and behaviors from TankShell, but it has a unique ability. 
   After the timer ends, it disappears and releases a random number, between 10 and 15, of Shrapnel objects in all directions.
	 
	* @author Alby Alex, Tavo Duvall, Dhruv Makwana, Muhurto Rahman
	* @version 2.15.2018 
	****************************************************************/
import java.awt.*;
public class BombShell extends TankShell
{
   /************************************************************* 
   * Constructs a BombShell using TankShell's constructor. Its size is doubled.
   * @param x    initial x position
   * @param y    initial y position
   * @param dx   initial dx position
   * @param dy   initial dy position
   **************************************************************/
   public BombShell(int x, int y, double dx, double dy)
   {
      super(x, y, dx, dy); 
      setDiameter(super.getDiameter()*2); //double size of TankShell
   }
   /************************************************************* 
   * Calls the methods that occur after the timer ends
   **************************************************************/
   public void timeUp()
   {
      super.disappear();
      fragments();
   }
   /************************************************************* 
   * Constructs a random number of Shrapnel objects that are spread in semi-random directions
   **************************************************************/
   public void fragments()
   {
      int shrap = (int)(Math.random()*10 + 10);
      for(int x = 0; x <= 360; x+=360/shrap) // 360/shrap is degree
      {
         if(x<180)//dx is >0
         {
            double c = Math.random()*4+1;
            double d;
            if(x<90)//dy >0
               d = Math.random()*4+1;
            else if(x>90)//dy<0
               d = -1*(Math.random()*4+1);
            else//dy=0
               c = 5.0;
            d = 0.0;
            Shrapnel x = new Shrapnel(getX(), getY(), c, d);
         }
         else if(x>180)//dx<0
         {
            double d; // dy value
            double c = -1*(Math.random()*4+1); //dx value
            if(x<270)//dy <0
               d = -1*(Math.random()*4+1);
            else if(x>270)//dy>0
               d = -1*(Math.random()*4+1);
            else//dy=0
               c = -5.0;
            d = 0.0;
            Shrapnel x = new Shrapnel(getX(), getY(), c, d);
         }
         else//dx0
         {
            double c = 0;
            double d;
            if(x == 0)
               d = 5;
            else
               d = -5;
            Shrapnel x = new Shrapnel(getX(), getY(), c, d);
         }
      }
   }
   
   
}