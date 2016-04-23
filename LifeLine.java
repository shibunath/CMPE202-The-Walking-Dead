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
    public LifeLine()
    {
    }
    private static int _lifelineCount = 0;
    
    
     public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
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
         UpdateBoosterLifeLine(_lifelineCount);
        
        
    }
    
      public void act() 
    {
        // Add your action code here.
        MyWorld world=(MyWorld)getWorld();
        Hero hero = world.getHero(); 
        
    }    
      
    
}
 