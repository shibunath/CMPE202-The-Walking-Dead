import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoAmmo extends Actor implements WeaponState
{
    /**
     * Act - do whatever the NoAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public NoAmmo(Arsenal bpRef, Hero hRef)
    {
        hbp = bpRef;
        h = hRef;
    }
    
    @Override
    public void fire()
    {
        GreenfootSound gun_shot = new GreenfootSound("sounds/no_ammo.wav");
        gun_shot.play();
    }
    
    @Override
    public void addAmmo(int newAmmo)
    {
        if (newAmmo > 0)
        {
            System.out.println("Added more ammo");
            hbp.ammo += newAmmo;
            hbp.setWeaponState(hbp.getHasAmmoState());
        }
    }
    
    @Override
    public void reload()
    {
        // delay weapon for a few seconds
    }
}
