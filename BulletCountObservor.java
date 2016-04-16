/**
 * Write a description of class BulletCountObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletCountObservor extends Observor 
{
     // instance variables - replace the example below with your own
    private int x;
    private LifeLine _lifeline;
    private Bullets _bullets;

    /**
     * Constructor for objects of class LifeLineObservor
     */
    public BulletCountObservor(Bullets bullets)
    {
        _bullets = bullets;
        _bullets.attach(this);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   @Override
   public void update() 
    {
        // put your code here
        System.out.println("updated bullets"+_bullets.GetBulletCount());
    }
}
