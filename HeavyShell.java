/*****************************************************************
	* The HeavyShell inherits all methods and behaviors from TankShell, but is larger and slower by 25%. 
   It also has double of myTime. The benefit is that it’s myDamage is 2, so that it can destroy any tank.
	 
	* @author Alby Alex, Tavo Duvall, Dhruv Makwana, Muhurto Rahman
	* @version 2.15.2018 
	****************************************************************/
import java.awt.*;
public class HeavyShell extends TankShell
{
   /************************************************************* 
   * Constructs a HeavyShell using TankShell's constructor. HeavyShell's mySpeed and myRadius are also added, with the speed factoring into the dx and dy.
   * @param x    initial x position
   * @param y    initial y position
   * @param dx   initial x movement
     * @param dy  initial y movement
   **************************************************************/
   public HeavyShell(int x, int y, double dx, double dy)
   {
      super(x, y, dx, dy);
      mySpeed = 0.75;
      myTime = 10;
      myDamage = 2;
      myRadius = 12.5;
      setdx(mySpeed*dx);
      setdy(mySpeed*dy);
      setRadius(myRadius);
   }
   
}