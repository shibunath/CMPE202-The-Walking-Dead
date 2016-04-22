/**
 * Write a description of class HasAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasAmmo implements WeaponState 
{
    HeroBackpack hbp;
    
    public HasAmmo(HeroBackpack bpRef)
    {
        hbp = bpRef;
    }
    
    @Override
    public void fire()
    {
        System.out.println("now we fire!");
        hbp.ammo -= 1;
        hbp.setWeaponState(hbp.getPullTriggerState());
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
