import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PulledTrigger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PulledTrigger extends Actor implements WeaponState
{
    /**
     * Act - do whatever the PulledTrigger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public PulledTrigger(Arsenal bpRef, Hero hRef)
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
            h.getWorld().addObject(new Default(), h.getX(), h.getY());
            GreenfootSound gun_shot = new GreenfootSound("sounds/gun_shot.wav");
            gun_shot.play();
            hbp.ammo -= 1;
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
