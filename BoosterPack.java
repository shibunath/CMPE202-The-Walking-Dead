import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * Write a description of class BoosterPack here.
 * 
 * @author (your name) 
 * @version (a ver sion number or a date)
 */ 
public class BoosterPack extends Actor
{
    
    GreenfootImage i;
    protected LifeLine _lifeLine;
    protected static int lifeLineCount = 0;
    protected static int bulletBoosterCount = 0;
    /**
     * Act - do whatever the BoosterPack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void Image(GreenfootImage s){
        i = s; 
        setImage(i); 
    }
    
    public void act() 
    {
        // Add your action code here.
        MyWorld world=(MyWorld)getWorld();
        world.UpdateWorldBoostCounter(lifeLineCount,bulletBoosterCount); 
        
    }   
    public void UpdateBoosterLifeLine(int count)
    {
         this.lifeLineCount = count;  
        
    }
    
    
    public LifeLine GetBoosterLifeLine()
    {
        return _lifeLine;
        
    }
    public static int GetBulletBoosterCount()
    {
        return bulletBoosterCount;
        
    }
     public void UpdateBulletBoosterCount(int count)
    {
         this.bulletBoosterCount = count; 
        
    }
}
 