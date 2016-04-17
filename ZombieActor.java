import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieActor extends Actor
{
    protected static final int ZVAL = 100; //smoothness value for actor
    
    private int zR;// rotation value for actor
    private int zX, zY;// actor location coordinates
    private int vX, vY;// speed quotients for horizontal and vertical axis
    private boolean rotationalBounce;
    
    public void move(){
        zX += vX;
        zY += vY;
        super.setLocation(zX/ZVAL, zY/ZVAL);
        rotationalBounce = false;
    }
    
    public int getZX(){  return zX; }
    public int getZY(){  return zY; }
    public int getZR(){  return zR; }
    public int getVX(){  return vX; }
    public int getVY(){  return vY; }
    public void setVX(int speed){    vX = speed; }
    public void setVY(int speed){    vY = speed; }
    
    public void setZRotation(int amount){
        zR = amount;
        super.setRotation(zR/ZVAL);
    }
    public void setZLocation(int x, int y){
        zX = x;
        zY = y;
        super.setLocation(zX/ZVAL, zY/ZVAL);
    }
}
