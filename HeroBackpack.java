/**
 * Write a description of class HeroBackpack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroBackpack  
{
    WeaponState hasAmmo;
    WeaponState noAmmo;
    WeaponState pullTrigger;
    WeaponState reload;
    
    WeaponState backpackState;
    
    int ammo = 50;
    int clip = 3;
    boolean trigger = false;
    
    public HeroBackpack()
    {
        hasAmmo = new HasAmmo(this);
        noAmmo = new NoAmmo(this);
        pullTrigger = new Fire(this);
        reload = new Reload(this);
        
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
}