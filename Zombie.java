import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends ZombieActor
{
    int dt=0; // turn rate of Zombie
    public void act() 
    {
        int dx =0, dy = 0;// diffrences in location coordinates
        int rate = 0; // rate of turning of the zombie and speed
        MyWorld mw = new MyWorld();
        Actor hero = mw.getHero();// get the hero object 
        
        if(hero != null && hero.getWorld() != null){
            dx = getX()-hero.getX();
            dy = getY()-hero.getY();
            rate = 400-(int)Math.abs(dx)-(int)Math.abs(dy);
        }
        
        if(rate > 100){
            turn(16*rate*(int)Math.signum((getRotation()-(int)(Math.atan2(dy, dx)*180/Math.PI)+540)%360-180));
            move();// edit later,, movement not so good yet..
        }else{// Zombie wandering
            dt += 2-Greenfoot.getRandomNumber(5)-(int)Math.signum(dt);
            if(dt < -40){
                dt=-40;
            }
            else if(dt > 40){
                dt=-40;
            }          
            turn(dt);
            move(10);
        }
        
    }    
}
