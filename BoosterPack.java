import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoosterPack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoosterPack extends Actor
{
    
    protected LifeLine _lifeLine;
    protected BulletBooster _bulletbooster;
    /**
     * Act - do whatever the BoosterPack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void UpdateBoosterLifeLine(LifeLine lifeLine)
    {
        this._lifeLine = lifeLine;
        
    }
    
    public void UpdateBoosterBullets(BulletBooster bulletbooster)
    {
        this._bulletbooster = bulletbooster;
        
    }
    
    public LifeLine GetBoosterLifeLine()
    {
        return _lifeLine;
        
    }
    public BulletBooster GetBulletBooster()
    {
        return _bulletbooster;
        
    }
}
