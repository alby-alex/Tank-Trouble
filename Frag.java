/**********************************************************************
* A Frag is an concrete class that extends abstract Tank   
* Overrides fire() method to shoot a Bomb Shell
*
*@author Alby, Tavo, Dhruv, & Muhurto 
***********************************************************************/
public class Frag extends Tank
{
  /**********************************************************************
   *Constructs Frag using Tank super constructpr, automatically passes 1 for speed and health, and .75 for firerate   
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/
  public Frag(int w,int h,double x,double y)
   {
      super(1,.75,1,w,h,x,y);
   }
  /**********************************************************************
   *Overrides abstract fire methods from Tank class, creates a BombShell at the tanks poistion going the same direction
   **********************************************************************/
  public void fire()
  {
   BombShell temp1 = new BombShell((int)getX(),(int)getY(),getDX(),getDY());
  }
}