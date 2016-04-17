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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        hero = new Hero();
        addObject(hero, 400, 300);
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 28));
        bg.setColor(Color.white);        
        bg.drawString("Kills: ", 600, 40); 
        setKill(0);
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
    
     public void setKill(int kill)
    {
        kills += kill; // increment kill      
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 28));
        bg.setColor(Color.white);
        bg.drawString(" "+kills, 690, 40);
    }

}
