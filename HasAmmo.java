import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HasAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasAmmo extends Actor implements WeaponState
{
    /**
     * Act - do whatever the HasAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public HasAmmo(Arsenal bpRef, Hero hRef)
    {
        hbp = bpRef;
        h = hRef;
    }
    
    @Override
    public void fire()
    {
        hbp.setWeaponState(hbp.getPullTriggerState());
        h.getWorld().addObject(new Default(), h.getX(), h.getY());
        GreenfootSound gun_shot = new GreenfootSound("sounds/gun_shot.wav");
        gun_shot.play();      
        hbp.ammo -= 1;
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
        if (hbp.clip > 0)
        {
            hbp.setWeaponState(hbp.getReloadState());
            System.out.println("Executed");
            hbp.clip -= 1;
            hbp.setAmmoInWeapon(100);
            GreenfootSound reload = new GreenfootSound("sounds/uReload.mp3");
            reload.play();
            hbp.setWeaponState(hbp.getHasAmmoState());
        }
    }
}
