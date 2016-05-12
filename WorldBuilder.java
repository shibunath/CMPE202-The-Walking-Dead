import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldBuilder
{

    public WorldBuilder()
    {
        // super(1000, 600, 1);
    }
    public PlayerLevel PrepareAndReturnLevel1 (){
     PlayerLevel level = new  PlayerLevel();
     level.addItem(new Level1BackGround());
     return  level;
   }   

     public PlayerLevel PrepareAndReturnLevel2 (){
        PlayerLevel level = new  PlayerLevel();
        level.addItem(new Level2BackGround());
        return level;
   }   
 
    
    
}
