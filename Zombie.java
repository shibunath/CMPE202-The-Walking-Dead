import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends ZombieActor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dt=0;
    public void act() 
    {
        int dx =0, dy = 0;
        int rate = 400-(int)Math.abs(dx)-(int)Math.abs(dy);
        dt += 2-Greenfoot.getRandomNumber(5)-(int)Math.signum(dt);
        if(dt < -40){
            dt=-40;
        }
        else if(dt > 40){
            dt=-40;
        }          
        turn(dt);
        move(dt);
    }    
}
