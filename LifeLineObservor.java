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
      private LifeLine _lifeline;

    /**
     * Constructor for objects of class LifeLineObservor
     */
    public LifeLineObservor(LifeLine life)
    {
        _lifeline = life;

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public void update() 
    {
        // put your code here
        System.out.println("updated life"+_lifeline.GetLifeLine());
    }
    
  
}
