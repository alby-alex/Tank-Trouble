/**********************************************************************
* A Heavy is an concrete class that extends abstract Tank   
* Overrides fire() method to shoot a Heavy Shell, can take 2 hits before death
*
*@author Alby, Tavo, Dhruv, and Muhurto 
***********************************************************************/
public class Heavy extends Tank
{
  /**********************************************************************
   *Constructs Heavy using Tank super constructpr, automatically passes .5 for speed and firerate, and 2 for health   
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/
   public Heavy(int w,int h,double x,double y)
   {
      super(.5,.5,2,w,h,x,y);
   }
  /**********************************************************************
   *Overrides abstract fire methods from Tank class, creates a HeavyShell at the tanks poistion going the same direction
   **********************************************************************/
   public void fire()
   {
      HeavyShell temp = new HeavyShell((int)getX(),(int)getY(),getDX(),getDY());
   }
}
