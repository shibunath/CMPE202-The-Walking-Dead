import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Actor
{
    
    public PlayAgain()
    {
        GreenfootImage playAgain = new GreenfootImage("playAgain.PNG");       
        playAgain.scale(150,100);
        setImage(playAgain);
    }
   
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new GameMenu());
           ExitScreen.gameOver.stop();
        }
    }    
}
