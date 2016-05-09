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
    public PlayerLevel PrepareLevel1 (){
     PlayerLevel level = new  PlayerLevel();
     level.addItem(new PlayerLevel1());
     return (PlayerLevel) level.getItem();
   }   

     public PlayerLevel PrepareLevel2 (){
        PlayerLevel level = new  PlayerLevel();
        level.addItem(new PlayerLevel2());
        return (PlayerLevel) level.getItem();
   }   
 
    
    
}
