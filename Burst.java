/**********************************************************************
* A Burst is an concrete class that extends abstract Tank   
* Overrides fire() method to shoot 3 shells.
*
*@author Alby, Tavo, Dhruv, and Muhurto 
***********************************************************************/
public class Burst extends Tank
{
  
 /**********************************************************************
   *Constructs Burst using Tank super constructpr, automatically passes 1 for speed firerate and health    
   *@param w   initial width
   *@param h   initial height
   *@param x   initial x position
   *@param y   initial y position
   **********************************************************************/
   public Burst(int w,int h,double x,double y)
   {
      super(1,1,1,w,h,x,y);
   }
  /**********************************************************************
   *Overrides abstract fire methods from Tank class, creates 3 TankShells at the tanks poistion going the same direction
   **********************************************************************/
   public void fire()
   {
      TankShell temp1 = new TankShell((int)getX(),(int)getY(),getDX(),getDY());
      TankShell temp2 = new TankShell((int)getX()-5,(int)getY()-5,getDX(),getDY());
      TankShell temp3 = new TankShell((int)getX()-10,(int)getY()-10,getDX(),getDY());
   }
}