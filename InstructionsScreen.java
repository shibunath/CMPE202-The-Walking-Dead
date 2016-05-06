import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class InstructionsScreen here.
 * 
 * @author Kushal
 * @version 1.0 / 04-30-2016
 */
public class InstructionsScreen extends World
{

    /**
     * Constructor for objects of class InstructionsScreen.
     * 
     */
    public InstructionsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.black); 
        bg.drawString("Hii",50, 100);
        prepare();
        
    }
    
    public void prepare()
    {
          ReturnMenu returnmenu = new ReturnMenu();
        addObject(returnmenu, 515, 380);
        //returnmenu.setLocation(507, 372);
        //returnmenu.setLocation(503, 371);
        returnmenu.setLocation(300, 530);
    }
}