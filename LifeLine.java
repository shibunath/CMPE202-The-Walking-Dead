import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeLineCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeLine extends Hero
{
    private int _lifeline = 0;
    /**
     * Act - do whatever the LifeLineCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public int GetLifeLine()
    {
        return _lifeline;
    }
    
    public void SetLifeLine(int lifeline)
    {
         _lifeline=lifeline;
    }
}
