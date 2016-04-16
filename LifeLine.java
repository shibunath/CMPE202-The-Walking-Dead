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
public class LifeLine extends Hero
{
    private List<Observor> observors = new ArrayList<Observor>();
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
         notifyAllObservors();
    }
    public void attach(Observor observor)
    {
        observors.add(observor);
    }
    public void notifyAllObservors()
    {
        for(Observor observor: observors)
        {
            observor.update();
        }
    }
}
