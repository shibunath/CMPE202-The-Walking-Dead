import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletBooster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletBooster extends BoosterPack
{
    /**
     * Act - do whatever the BulletBooster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BulletBooster()
    {
    }
    private int _bulletBoosterCount = 0;
    /**
     * Getter for lifeline
     * 
     */
      public int GetBulletBoosterCount()
    {
        return _bulletBoosterCount;
    }
    
      /**
     * Setter for BulletBooster
     * 
     */
    public void SetBulletBoosterCount(int bulletBoosterCount)
    {
         _bulletBoosterCount=bulletBoosterCount;
       
    }
}
