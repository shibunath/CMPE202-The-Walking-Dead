import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveAndAim();
        shoot();
    }
    
    /**
     * moveAndAim - use keyboard "w, a, s, and d" to control movement; use mouse to aim
     *
     */
    public void moveAndAim()
    {
        // turn towards mouse when mouse moves
        if (Greenfoot.mouseMoved(null) || Greenfoot.mouseDragged(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) turnTowards(mouse.getX(), mouse.getY());
        }
        int dx = 0, dy = 0; // 2D axis coordinates
        int moveSpeed = 2;
        if (Greenfoot.isKeyDown("a")) dx--;
        if (Greenfoot.isKeyDown("d")) dx++;
        if (Greenfoot.isKeyDown("w")) dy--;
        if (Greenfoot.isKeyDown("s")) dy++;
        setLocation(getX() + moveSpeed*dx, getY() + moveSpeed*dy);
    }
    
    /**
     * shoot - when left click mouse keys, shoots bullets from the hero
     *
     */
    public void shoot()
    {
        // put your code here
        if (Greenfoot.mouseClicked(null))
        {
            getWorld().addObject(new Default(), getX(), getY());
        }
    }

}
