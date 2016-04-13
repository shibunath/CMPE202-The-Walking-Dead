import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean setRot = false;
    private int speed = 15;
    
    public boolean getSetRot()
    {
        return setRot;
    }
    
    /**
     * setSetRot - set the rotation of the bullet, mark rotation as set
     *
     * @param  newRot   new rotation
     */
    public void setSetRot(int newRot)
    {
        setRotation(newRot);
        setRot = true;
    }
    
    /**
     * getSpeed - get the speed of this bullet, default is 15
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * setSpeed - set the speed of the bullet
     *
     * @param  y   new speed
     */
    public void setSpeed(int s)
    {
        // put your code here
        speed = s;
    }

    
    public void act()
    {
        
    }    
}
