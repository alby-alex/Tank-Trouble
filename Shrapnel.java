import java.awt.*;
public class Shrapnel extends TankShell
{
   /************************************************************* 
   * Constructs a Shrapnel using TankShell's constructor.
   * @param x    initial x position
   * @param y    initial y position
   * @param dx   initial x movement
   * @param dy   initial y movement
   **************************************************************/
   public Shrapnel(int x, int y, double dx, double dy)
   {
      super(x, y, dx, dy);
   }
   /************************************************************* 
   * Makes the method timer(), inherited from TankShell, have no effect
   **************************************************************/
   public void timer()
   {
   }
   /************************************************************* 
   * Redefines Ball's move method, making it so that if the Shrapnel hits a Bumper, it will disappear
   * @param rightEdge    Bumper's rightEdge
   * @param bottomEdge   Bumper's bottomEdge
   **************************************************************/
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX() + dx);
      if(getX() >= rightEdge - getRadius() || getX()<= getRadius())
         disappear();
      setY(getY() + dy);
      if(getY() >= bottomEdge - getRadius() || getY()<= getRadius())
         disappear();
   }
   
}