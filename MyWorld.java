import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
 
    /** 
     * Constructor for objects of class MyWorld.
     * 
     */
    private Hero hero;// keep a reference of the hero object for the whole game
    private int kills; // Number of Zombies Killed.
    private int lifes; // Number of Player Lifes.
    
    private int Count=0;
    
     
    private GreenfootImage bgImage = new GreenfootImage("Game.jpg");
 
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        hero = new Hero();
        addObject(hero, 400, 300);
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
        bg.drawString("Lifes: ", 50, 40);
        addLife(3);
        bg.drawString("Kills: ", 600, 40); 
        setKill(0);
    }
    
    public boolean checkCount()
    {
        if(Count>=-120 && Count<=120)
        return true;
        
        return false;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public Hero getHero()
    {
        // get the reference of the hero in our World class object
        return hero;
    }
    
    public void subtract()
    {
        Count-=3;
    }
    
    public void add()
    {
        Count+=3;
    }
    
    public void moveIt()
    {
        moveBackground();
    }
    
    public void persistText()
    {
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
        bg.drawString("Lifes: ", 50, 40);
        bg.drawString(""+lifes, 130, 40);     
        bg.drawString("Kills: ", 600, 40); 
        bg.drawString(""+kills, 675, 40);
    }
    
    
    public void act()
    {
       
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
    
        Zombie zom = new Zombie();
        if(x <=2 || y<=2){
            addObject(zom, x, y);
        }
        zom.turnTowards(400, 300);
    }
    
    
    public void moveBackground() 
    {
    
    if (Count < -bgImage.getWidth())
    {
        Count += bgImage.getWidth();
    }
    
    int t = Count;
   
    getBackground().drawImage(bgImage, t, 0);
     
    getBackground().drawImage(bgImage, t + bgImage.getWidth(), 0);
    persistText();
  
}
    
    public void setKill(int kill)
    {
        kills += kill; // increment kill      
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+kills, 675, 40);
    }
    
    public void addLife(int life)
    {
        lifes += life;
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+lifes, 130, 40);                
    }
    
    public void removeLife(int life)
    {
        lifes -= life;
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+lifes, 130, 40);                
    }

}
