import greenfoot.*; 
import java.util.*;
/**
 * Write a description of class PowerUpObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpObservor extends GameObservorBase 
{
    // instance variables - replace the example below with your own
    private int x;
    private List<PowerUpObservor> observors = new ArrayList<PowerUpObservor>();
    /**
     * Constructor for objects of class PowerUpObservor
     */
    public PowerUpObservor()
    {

    } 

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void Notify(Actor actor)
    {
        // put your code here
       //System.out.println("notify observors");
             
        //add logd on actor
        for(PowerUpObservor observor: observors)
        {
            observor.update(actor);
        }
       
    }
   public void attach(PowerUpObservor observor)
   {
        observors.add(observor);
   }
   public void update(Actor actor)
   {
       
   }
}
 