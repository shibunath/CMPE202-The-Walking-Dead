import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoosterFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoosterFactory 
{
    /**
     * Act - do whatever the BoosterFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BoosterPack GetBooster(GameEnum.BoosterTypes boosterType) 
    {
        if(boosterType == GameEnum.BoosterTypes.LIFE)
        {
            return new LifeLine();
        }
        else if(boosterType == GameEnum.BoosterTypes.BULLET)
        {
            return new BulletBooster();
        }
        return null;
        // Add your action code here.
    }    
}
