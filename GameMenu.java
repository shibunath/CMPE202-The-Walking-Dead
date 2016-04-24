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
    static GreenfootSound menu_music = new GreenfootSound("menu.wav");
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
    {   if(menu_music.isPlaying() == false)
         {
             menu_music.playLoop();
             menu_music.setVolume(100);
         }              
        
        if ( Greenfoot.mouseClicked(startgame))
        {
            menu_music.stop();
        }
    }
}
