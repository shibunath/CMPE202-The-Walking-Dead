import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletBooster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletBooster extends BoosterPack
{
    GreenfootImage i;
    /** 
     * Act - do whatever the BulletBooster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BulletBooster()
    {
    }
    private static int _bulletBoosterCount = 0;
    private static  MyWorld _world = null;
    
    
     public void act() 
    {
        // Add your action code here.
         if (isTouching(Hero.class))
        {
            MyWorld world=(MyWorld)getWorld();
            _world = world;
            getWorld().removeObject(this);
            super.Notify(this);
    
            
        }
              
    }  
   
     /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
    }
    /**
     * Getter for lifeline
     *  
     */ 
      public static int GetBulletBoosterCount()
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
          UpdateBulletBoosterCount(_bulletBoosterCount); 
          if(_world!=null)
          {
                _world.UpdateWorldBoostCounter(_bulletBoosterCount,0); 
           }
      
       
    }
}
 