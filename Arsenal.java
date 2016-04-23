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
    
    WeaponState backpackState;
    
    int ammo = 50;
    int clip = 3;
    boolean trigger = false;
    
    public Arsenal(Hero heroRef)
    {
        hasAmmo = new HasAmmo(this, heroRef);
        noAmmo = new NoAmmo(this, heroRef);
        pullTrigger = new Fire(this, heroRef);
        reload = new Reload(this, heroRef);
        
        backpackState = reload;
        
        if(ammo < 1)
        {
            backpackState = noAmmo;
        }
    }
    
    void setWeaponState(WeaponState newState)
    {
        backpackState = newState;
    }
    
    public void setAmmoInWeapon(int newAmmo)
    {
        ammo = newAmmo;
    }
    
    public void fire()
    {
        backpackState.fire();
    }
    public void addAmmo(int ammo)
    {
        backpackState.addAmmo(ammo);
    }
    public void reload()
    {
        backpackState.reload();
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
