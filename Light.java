/**********************************************************************
* A Light is an concrete class that extends abstract Tank   
* Overrides fire() method to shoot one smaller shell at a faster rate.
*
*@author Alby, Tavo, Dhruv, & Muhurto 
***********************************************************************/
public class Light extends Tank
{
  /**********************************************************************
   *Constructs Light using Tank super constructpr, automatically passes 2 for speed firerate and 1 for health.  
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/
   public Light(int w,int h,double x,double y)
   {
      super(2,2,1,w,h,x,y);
   }
  /**********************************************************************
   *Overrides abstract fire methods from Tank class, creates a SmallShell at the tanks poistion going the same direction
   **********************************************************************/
   public void fire()
   {
      SmallShell temp1 = new SmallShell((int)getX(),(int)getY(),getDX(),getDY());
   }
}