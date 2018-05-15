import java.awt.*;
/*****************************************************************
 * A Ball is a Polkadot that maintains information about its movement. A Ball
 * knows how to return its x movement and its y movement, set its x movement and y movement, and move.

 * 
 ****************************************************************/
public class Ball extends Polkadot
{
   private double dx;   
   private double dy;
   /*************************************************************
    * Constructs a Ball with initial x movement 2 and its initial y movement -2.
    **************************************************************/
   public Ball()
   {
      super(200, 200, 50, Color.BLACK);
      dx = 2;
      dy = -2;
   }
   /*************************************************************
    * Constructs a Ball with initial x movement specified by x, its initial y movement specified by y and passes values for other aspects to polkadot's construtor.
    * @param x    initial x movement
    * @param y    initial y movement
    * @param dia  initial diameter
    * @param c    initial color
    **************************************************************/
   public Ball(double x, double y, double dia, Color c)
   {
      super(x, y, dia, c);
      dx = 2;
      dy = -2;
   }
   /*************************************************************
    * changes the Xmovement value
    * @param x    new x movement
    **************************************************************/
   public void setdx(double x)
   {
      dx = x;
   }
   /*************************************************************
    * changes the ymovement value
    * @param y    new y movement
    **************************************************************/
   public void setdy(double y)
   {
      dy = y;
   }
   /*************************************************************
    * returns the x movement value
    * @return dx
    *************************************************************/
   public double getdx()
   {
      return dx;
   }
   /*************************************************************
    * returns the y movement value
    * @return dy
    *************************************************************/
   public double getdy()
   {
      return dy;
   }
   /*************************************************************
    * moves the ball
    * @param rightEdge right edge of movement space
    * @param bottomEdge bottom edge of movement space
    *************************************************************/
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);
   
      if(getX() >= rightEdge - getRadius())
      {
         setX(rightEdge - getRadius());
         dx = dx * -1;
      }
      else if(getX()<= getRadius())
      {
         setX(getRadius());
         dx = dx * -1;
      }
      setY(getY()+ dy);
   
      if(getY() >= bottomEdge - getRadius())
      {
         setY(bottomEdge - getRadius());
         dy = dy * -1;
      }
      else if(getY()<= getRadius())
      {
         setY(getRadius());
         dy = dy * -1;
      }   
      
   }
}