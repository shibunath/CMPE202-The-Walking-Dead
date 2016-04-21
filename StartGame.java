import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class StartGame here.
 * 
 * @author Kushal
 * @version 1.0 / 04-20-2016
 */
public class StartGame extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    private MyWorld myWorld = new MyWorld();
    private ICommand myGame = new MyGameCommand(myWorld);
    
    public StartGame ()
    {
        
        /*GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
        bg.drawString("Start Game", 200, 230);*/
        GreenfootImage start = new GreenfootImage("Start.png");
        setImage (start);
        
    }
    
    public void act() 
    {
        menuInvoker.setCommand(myGame);
        if (Greenfoot.mouseClicked(this)){
            
            menuInvoker.clickMenuOption();
        }
    }    
}
