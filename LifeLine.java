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
    
    public LifeLine()
    {
    }
    private int _lifeline = 0;
    /**
     * Getter for lifeline
     * 
     */
      public int GetLifeLine()
    {
        return _lifeline;
    }
    
      /**
     * Setter for lifeline
     * 
     */
    public void SetLifeLine(int lifeline)
    {
         _lifeline=lifeline;
       
    }
    
}
