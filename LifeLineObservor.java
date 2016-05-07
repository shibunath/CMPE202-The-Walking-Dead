import greenfoot.*; 
/**
 * Write a description of class LifeLineObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeLineObservor extends PowerUpObservor 
{
    // instance variables - replace the example below with your own
    LifeLine _lifeline;

    /**
     * Constructor for objects of class LifeLineObservor
     */
    public LifeLineObservor()
    {
    _lifeline = new LifeLine();

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public void update(Actor actor) 
    {
        // put your code here
        String name = actor.getClass().getName();
        if(name == "LifeLine")
        {
        Integer currentCount = LifeLine.GetLifeLine();
        _lifeline.SetLifeLine(currentCount,false);
        }
        //System.out.println("life counter"+LifeLine.GetLifeLine());
    }
    
  
}
 