import greenfoot.*; 
import java.util.ArrayList;
import java.util.List;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeLineCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeLine extends BoosterPack
{ 
    GreenfootImage i;
    private static int _lifelineCount = 0;
    private static  MyWorld _world = null;
    
    public LifeLine()
    {
       // _lifelineCount = 0;
    }
   
    
     public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
    }
    
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
    
     public static void ResetLifeBoosterCount()
    {
       _lifelineCount = 0;
    }
 
    /**
     * Getter for lifeline
     * 
     */
      public static int GetLifeLine()
    {
        return _lifelineCount;  
    }
    
      /**
     * Setter for lifeline
     * 
     */
    public void SetLifeLine(int lifelineCount)
    {
         _lifelineCount=lifelineCount;
         //UpdateBoosterLifeLine(_lifelineCount);
          if(_world!=null)
          {
                _world.UpdateWorldLifeBooster(_lifelineCount); 
           }
        
        
    }
    
  
}
 