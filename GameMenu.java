import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenu extends World
{
    private StartGame startgame = new StartGame();
    //GreenfootSound click = new GreenfootSound("click.wav");
    
    /**
     * Constructor for objects of class GameMenu.
     * 
     */
    public GameMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage gameMenuBackground = new GreenfootImage("menu_background.png");
        gameMenuBackground.scale(800,600);
        setBackground(gameMenuBackground);     
        prepare();
    }
    
    private void prepare()
    {
        addObject(startgame,300,300);
    }
    
    public void act()
    {
        /*if ( Greenfoot.mouseClicked(startgame))
        {
            click.play();
        }*/
    }
}
