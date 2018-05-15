/*****************************************************************
	* The SmallShell inherits all traits from TankShell, with the major difference of it being 25% smaller and faster. 
      Each hit does 0.5 damage and lasts for half the time of a regular TankShell.
	 
	* @author Alby Alex, Tavo Duvall, Dhruv Makwana, Muhurto Rahman
	* @version 2.15.2018 
	****************************************************************/
import java.awt.*;
public class SmallShell extends TankShell
{
/************************************************************* 
   * Constructs a SmallShell using TankShell's constructor. SmallShell's mySpeed and myRadius are also added, with the speed factoring into the dx and dy.
   * @param x    initial x position
   * @param y    initial y position
   * @param dx   initial x movement
   * @param dy   initial y movement
   **************************************************************/
   public SmallShell(int x, int y, double dx, double dy)
   {
      super(x, y, dx, dy);
      mySpeed = 1.25;
      myTime = 2.5;
      myDamage = 0.5;
      myRadius = 7.5;
      setdx(mySpeed*dx);
      setdy(mySpeed*dy);
      setRadius(myRadius);
   }
   
}