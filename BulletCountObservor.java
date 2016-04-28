import greenfoot.*; 
/**
 * Write a description of class BulletCountObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletCountObservor extends PowerUpObservor 
{
     // instance variables - replace the example below with your own
    private BulletBooster _bullets;

    /**
     * Constructor for objects of class BulletCountObservor
     */
    public BulletCountObservor()
    {
        _bullets = new BulletBooster();

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
        Integer currentCount = BulletBooster.GetBulletBoosterCount();
        _bullets.SetBulletBoosterCount(currentCount+1);
        //MyWorld.
      
        //System.out.println("bullet counter"+BulletBooster.GetBulletBoosterCount());
      
    }
    
   
}
 