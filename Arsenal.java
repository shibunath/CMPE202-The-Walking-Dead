import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arsenal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arsenal extends Actor
{
    WeaponState hasAmmo;
    WeaponState noAmmo;
    WeaponState pullTrigger;
    WeaponState reload;
    
    WeaponState curState;
    
    int ammo = 100;
    int clip = 3;
    boolean trigger = false;
    
    public Arsenal(Hero heroRef)
    {
        hasAmmo = new HasAmmo(this, heroRef);
        noAmmo = new NoAmmo(this, heroRef);
        pullTrigger = new PulledTrigger(this, heroRef);
        reload = new Reload(this, heroRef);
        
        if(ammo < 1)
        {
            curState = noAmmo;
        }
        else
        {
            curState = hasAmmo;
        }
    }
    
    void setWeaponState(WeaponState newState)
    {
        curState = newState;
    }
    
    public void setAmmoInWeapon(int newAmmo)
    {
        ammo = newAmmo;
    }
    
    public void fire()
    {
        curState.fire();
    }
    public void addAmmo(int ammo)
    {
        curState.addAmmo(ammo);
    }
    public void reload()
    {
        curState.reload();
    }
    
    public WeaponState getHasAmmoState() { return hasAmmo;}
    public WeaponState getNoAmmoState() { return noAmmo;}
    public WeaponState getPullTriggerState() { return pullTrigger;}
    public WeaponState getReloadState() { return reload;}
    
    /**
     * Act - do whatever the Arsenal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
