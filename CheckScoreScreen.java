import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class CheckScoreScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckScoreScreen extends World
{

    /**
     * Constructor for objects of class CheckScoreScreen.
     * 
     */
    
    public CheckScoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);     
        GreenfootImage bg = new GreenfootImage("back.jpg");
        bg.scale(1000,600);
        setBackground(bg);
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.black);         
        prepare();
    }
    
    public void prepare()
    {
          ReturnExit returnexit = new ReturnExit();
          addObject(returnexit, 515, 380);
        //returnmenu.setLocation(507, 372);
        //returnmenu.setLocation(503, 371);
          returnexit.setLocation(500, 530);
    }
}
