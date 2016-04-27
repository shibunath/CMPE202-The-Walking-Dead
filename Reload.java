import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reload here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reload extends Actor implements WeaponState
{
    /**
     * Act - do whatever the Reload wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public Reload(Arsenal bpRef, Hero hRef)
    {
        hbp = bpRef;
        h = hRef;
    }
    
    @Override
    public void fire()
    {
        if(hbp.ammo > 0)
        {
            System.out.println("now we fire!");
            hbp.ammo -= 1;
            hbp.setWeaponState(hbp.getPullTriggerState());
        }
        else
        {
            System.out.println("now we are out of ammo!");
            hbp.setWeaponState(hbp.getNoAmmoState());
        }
    }
    
    @Override
    public void addAmmo(int newAmmo)
    {
        if (newAmmo > 0)
        {
            System.out.println("Added more ammo");
            hbp.ammo += newAmmo;
        }
    }
    
    @Override
    public void reload()
    {
        // delay weapon for a few seconds
    }
}
