/**
 * Write a description of class HasAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoAmmo implements WeaponState 
{
    HeroBackpack hbp;
    
    public NoAmmo(HeroBackpack bpRef)
    {
        hbp = bpRef;
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
            hbp.setWeaponState(hbp.getHasAmmoState());
        }
    }
    
    @Override
    public void reload()
    {
        // delay weapon for a few seconds
    }
}