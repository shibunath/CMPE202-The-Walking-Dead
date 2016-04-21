import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends ZombieActor
{   
    int dt = 0; // Zombie turn rate
    
    public Zombie()
    {
        GreenfootImage image = new GreenfootImage(30, 30);
        image.fillOval(0, 0, 30, 30);
        image.setColor(new java.awt.Color(224, 240, 255));
        image.fillOval(7, 7, 16, 16);
        setImage(image);
    }

    
    public void act()
    {
        int dx = 0, dy = 0; // the differences in locational coordinates of Zombie and hero
        int rate = 0; // the rate of turn and moving speed
        MyWorld world = new MyWorld();
        Actor hero = world.getHero();
        if (hero != null && hero.getWorld() != null)
        { 
            dx = getX()-hero.getX();
            dy = getY()-hero.getY();
            rate = 300-(int)Math.abs(dx)-(int)Math.abs(dy);
        }
        if (rate > 100)
        { // chase
            int angleDiff = getRotation()-(int)(Math.atan2(dy, dx)*180/Math.PI); // range: -359 to 359
            int anglet = (angleDiff+360+180)%360-180; // range: -180 to 179 (sign is turn direction)
               
            turn(rate*(int)Math.signum(anglet)); 
            move(rate/4, getZR());
        }
        else
        { // Zombie wander           
            dt += 2-Greenfoot.getRandomNumber(5)-(int)Math.signum(dt);
            // limit turn rate to between 40 units left and right
            if (dt < -40) dt = -40;
            if (dt > 40) dt = 40;
            // turn and move
            turn(dt);
            move(50);
        }
    }
}