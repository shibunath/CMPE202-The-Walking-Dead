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
    
    public boolean getSetRot()
    {
        return setRot;
    }
    
    public void setSetRot(int newRot)
    {
        setRotation(newRot);
        setRot = true;
    }
    
    public void act()
    {
        // get a reference of the world so that to get a ref of the hero
        MyWorld myWorldRef = (MyWorld)getWorld();
        Hero heroRef = myWorldRef.getHero();
        if (getSetRot() != true)
        {
            setSetRot(heroRef.getRotation());
        }
        move(10);
        if(isAtEdge())
        {
            myWorldRef.removeObject(this);
        }
    }    
}
