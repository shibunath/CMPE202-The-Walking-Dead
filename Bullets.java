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
    
    
    
    public void act()
    {
        // get a reference of the world so that to get a ref of the hero
        MyWorld myWorldRef = (MyWorld)getWorld();
        Hero heroRef = myWorldRef.getHero();
        setRotation(heroRef.getRotation());
        move(10);
    }    
}
