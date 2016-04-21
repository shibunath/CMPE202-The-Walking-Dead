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
    public BulletCountObservor(BulletBooster bullets)
    {
        _bullets = bullets;

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
        System.out.println("updated bullets"+_bullets.GetBulletBoosterCount());
    }
    
   
}
