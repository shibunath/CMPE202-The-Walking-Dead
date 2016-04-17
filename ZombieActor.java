import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieActor extends Actor
{
    protected static final int QVAL = 100;
    
    private int qR;
    private int qX, qY;
    private int vX, vY;
    private boolean rotationalBounce;
    
    public void move(){
        qX += vX;
        qY += vY;
        super.setLocation(qX/QVAL, qY/QVAL);
        rotationalBounce = false;
    }
}
