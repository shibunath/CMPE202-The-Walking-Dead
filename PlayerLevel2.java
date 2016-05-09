/**
 * Write a description of class PlayerLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerLevel2 implements WorldItem 
{
    public String WorldBackGroundImgName()
    {
        return "background1.png";
    }
    public int PlayerLevel()
    {
        return 1;
    }
    public int PlayerScore()
    {
        return 1000;
    }
    public int scoreThresholdForNextLevel()
    {
        return 4000;
    }
}
