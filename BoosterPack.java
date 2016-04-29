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
    private PowerUpObservor _powerUpObserver = new PowerUpObservor();
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
        Actor actorZom = getOneIntersectingObject(BoosterPack.class);
        if(actorZom != null){
           // world.UpdateWorldBoostCounter(lifeLineCount,bulletBoosterCount); 
          }
        
    }   
    public void UpdateBoosterLifeLine(int count)
    {
         this.lifeLineCount = count;  
        
    }
    
    public static void ResetCount()
    {
        lifeLineCount = 0;
        bulletBoosterCount = 0;
    }
    
    public static int GetBoosterLifeLineCount()
    {
        return lifeLineCount;
        
    }
    public static int GetBulletBoosterCount()
    {
        return bulletBoosterCount;
        
    }
     public void UpdateBulletBoosterCount(int count)
    {
         this.bulletBoosterCount = count; 
        
    }
    
    public void Notify(Actor booster)
    {
         //String image=booster.GreenfootImage.imageFileName;
        _powerUpObserver.attach(new LifeLineObservor());
        _powerUpObserver.attach(new BulletCountObservor());
        _powerUpObserver.Notify(booster);
        
    }
}
 