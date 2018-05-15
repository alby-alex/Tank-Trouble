/*****************************************************************
 * A TankShell is a projectile that maintains information about its damage, time, speed, and radius. A TankShell
 * knows how to return all of its time and diameter, set its diameter, keep track of how long it has been on the board, and
 * erase itself from the board.

 * @author Alby A, Tavo D, Dhruv M, Muherto R
 * @1.0
 ****************************************************************/
import java.awt.*;
import java.*;
public class TankShell extends Ball
{
   public double myDamage, myTime;
   public double mySpeed, myRadius;
   /*************************************************************
    *Constructs a TankShell with initial x coordinate specified by x, its initial y coordinate specified by y, its initial X movement speed, specified by dx, and its initial Y movement speed specified by dy.
    * @param x    initial X coordinate
    * @param y    initial Y coordinate
    * @param dx   initial X movement speed
    * @param dy   initial Y movement speed
    **************************************************************/
   public TankShell(int x, int y, double dx, double dy)
   {
      super(x, y, 10, Color.BLACK); //this is literally just a smaller ball, change diameter later
      super.setdx(dx);
      super.setdy(dy);
      myDamage = 1;
      mySpeed = 1.0;
      myTime = 5; 
      myRadius = 10;
   }
   /*************************************************************
    * Constructs a TankShell with initial x coordinate specified by x, its initial y coordinate specified by y, its initial X movement speed, specified by dx, its initial Y movement speed specified by dy and its initial radius specified by r.
    * @param x    initial X coordinate
    * @param y    initial Y coordinate
    * @param dx   initial X movement speed
    * @param dy   initial Y movement speed
    * @param r    initial radius
    **************************************************************/
   public TankShell(int x, int y, double dx, double dy, double r)
   {
      super(x, y, r, Color.BLACK); //this is literally just a smaller ball, change diameter later
      super.setdx(dx);
      super.setdy(dy);
      myDamage = 1;
      mySpeed = 1.0;
      myTime = 5; 
   }
   //accessors and modifiers
   /***************************************************************
    * Returns the TankShell's Timer
    * @return   myTime
    **************************************************************/
   public double getTime()
   {

      return myTime;
   }

   //new methods
   /***************************************************************
    * Destroys the shell if its timer is up
    *
    **************************************************************/
   public void timeUp() // changes for some classes
   {
      disappear();
   }
   /***************************************************************
    * keeps track of the time the shell has been on the field
    *
    **************************************************************/
   public void timer()
   {
      long x = System.currentTimeMillis();
      long y;
      do{
         y = System.currentTimeMillis();
         if(y>=x + getTime()*1000)//will wait for 5 sec after call to method
            timeUp();
      }
      while(y < 5000+x);
   }
   /***************************************************************
    * Destroys the shell by teleporting it away
    *
    **************************************************************/
   public void disappear()
   {
      setX(10000);
      setY(10000);
      setdx(0);
      setdy(0);
   }
}