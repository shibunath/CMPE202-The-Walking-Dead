import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
import java.lang.Object;
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
//    GifImage gif = new GifImage("start.gif");
    public StartGame ()
    {        
        GreenfootImage start = new GreenfootImage("Start.png");            
        setImage(start);
        //setImage(gif.getCurrentImage());
        
    }
    
    public void act() 
    {      
       menuInvoker.setCommand(myGame);
        if (Greenfoot.mouseClicked(this)){
            
            menuInvoker.clickMenuOption();
        }
    }    
}
