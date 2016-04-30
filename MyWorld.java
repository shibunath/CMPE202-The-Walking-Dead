import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
 
    /** 
     * Constructor for objects of class MyWorld.
     * 
     */
    private Hero hero;// keep a reference of the hero object for the whole game
    private int kills; // Number of Zombies Killed.
    private int lifes; // Number of Player Lifes.
    
    private int Count=0;
    public static int actionType, actionDistance;
     
    private GreenfootImage bgImage = new GreenfootImage("Game.jpg");
    private GreenfootImage boosterImg;
    private GreenfootImage bulletImg;
    private GreenfootImage lifeImg;
    private BoosterPack boosterpack;
    private BulletBooster buletbooster;
    private LifeLine lifeLineBooster;
    
    private EPosition eP;
    private IPosition iP;
    private PositionX xP;
    private PositionY yP;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        hero = new Hero();
        addObject(hero, 400, 300);
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
        bg.drawString("Lifes: ", 50, 40);
        addLife(3);
        bg.drawString("Kills: ", 600, 40); 
        setKill(0);
        LifeLine.ResetLifeBoosterCount();
        BulletBooster.ResetBulletBoosterCount();
        boosterpack = new BoosterPack();
        buletbooster = new BulletBooster();
        lifeLineBooster = new LifeLine();
        //buletbooster
        GreenfootImage lifeIcon = new GreenfootImage("herz_small.png");
        GreenfootImage bulletIcon = new GreenfootImage("powerup_small.png");
        //boosterImg = new GreenfootImage("Bullet Boost : " +0 +"\n Life Boost : "+0, 20, Color.WHITE, Color.BLACK);
        lifeLineBooster.Image(lifeIcon);
        buletbooster.Image(bulletIcon);
        addObject(lifeLineBooster, 610, 60);
        addObject(buletbooster, 700, 60);
        addBulletBoosterToWorld();
        addLifeBoosterToWorld();
        setAction(0);
        
        eP=new EPosition();
        xP=new PositionX(eP);
        xP.setPosition(hero.getX());
        yP=new PositionY(xP);
        yP.setPosition(hero.getY());
        iP=yP;
          
       System.out.println(iP.getPosition());
    }
    
    public void setP(int x,int y)
    {
          eP=new EPosition();
        xP=new PositionX(eP);
        xP.setPosition(x);
        yP=new PositionY(xP);
        yP.setPosition(y);
        iP=yP;
        
        System.out.println(iP.getPosition());
    }
    
    public void addBulletBoosterToWorld()
    {
        int xcord = 640;
        int ycord = 500;
        buletbooster = new BulletBooster();
        addObject(buletbooster,640,500); 
        for (int i=1 ; i < 5 ; i++)
         {
                GreenfootImage bulletImg =new GreenfootImage("ammunition-icon.png");
                buletbooster = new BulletBooster();
                buletbooster.Image(bulletImg);
                xcord=getRandomNumber(50,1000);
                ycord=getRandomNumber(0,1000);
                addObject(buletbooster,xcord,ycord); 
        
         }        
    }
    
     public void addLifeBoosterToWorld()
    {
        int xcord = 640;
        int ycord = 500;
        for (int i=0 ; i < 3 ; i++)
        {
                GreenfootImage lifelineimg =new GreenfootImage("power.png");
                lifeLineBooster = new LifeLine();
                lifeLineBooster.Image(lifelineimg);
                xcord=getRandomNumber(50,1000);
                ycord=getRandomNumber(0,1000);
                addObject(lifeLineBooster,xcord,ycord); 
        
        }        
    }
    
    public int getRandomNumber(int start,int end)
    {
           int normal = Greenfoot.getRandomNumber(end-start+1);
           return normal+start;
    }
    public boolean checkCount()
    {
        if(Count>=-228 && Count<=228)
        return true;
        
        return false;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public Hero getHero()
    {
        // get the reference of the hero in our World class object
        return hero;
    }
    
    public void subtract()
    {
        Count-=3;
    }
    
    public void add()
    {
        Count+=3;
    }
    
    public void moveIt()
    {
        moveBackground();
    }
    
    public void persistText()
    {
        GreenfootImage bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
        bg.drawString("Lifes: ", 50, 40);
        bg.drawString(""+lifes, 130, 40);     
        bg.drawString("Kills: ", 600, 40); 
        bg.drawString(""+kills, 675, 40);
    }
    
    
    public void act()
    {
        GameMenu.gamesound.playLoop();
        GameMenu.gamesound.setVolume(60);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        int rand = Greenfoot.getRandomNumber(4);
        if (rand < 2) x = (getWidth()-3+actionDistance*2)*rand+1-actionDistance;
        else y = (getHeight()-3+actionDistance*2)*(rand-2)+1-actionDistance;       
        Zombie zom = new Zombie();
        if(getObjects(Zombie.class).size()<30 &&Greenfoot.getRandomNumber(90) <= 40)
        {
            addObject(zom,x,y);
        }
        
        zom.turnTowards(400, 300);
    }
    
    private void setAction(int action){
        removeObjects(getObjects(Zombie.class));
        actionType = action%5;
        int[] distances = { 0, 0, -10, 0, -15 }; // bound ranges
        actionDistance = distances[actionType];
    }
    
    
    public void moveBackground() 
    {
    
    if (Count < -bgImage.getWidth())
    {
        Count += bgImage.getWidth();
    }
    
    int t = Count;
   getBackground().drawImage(bgImage, t-bgImage.getWidth(), 0); 
    getBackground().drawImage(bgImage, t, 0); 
    getBackground().drawImage(bgImage, t + bgImage.getWidth(), 0);
    persistText();
  
}
    
    public void setKill(int kill)
    {
        kills += kill; // increment kill      
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+kills, 675, 40);
    }
    
    public void addLife(int life)
    {
        lifes += life;
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+lifes, 130, 40);                
    }
    
    public void removeLife(int life)
    {
        lifes -= life;
        GreenfootImage bg = getBackground();                    
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);
        bg.drawString(""+lifes, 130, 40);                
    }
    
     public void UpdateWorldBoostCounter(int bulletCount)
    {
        boosterImg = new GreenfootImage(" " +bulletCount, 20, Color.BLACK, Color.WHITE);
        boosterpack = new BoosterPack();
        boosterpack.Image(boosterImg);
        addObject(boosterpack, 750, 60); 
    }
    
     public void UpdateWorldLifeBooster(int lifeCount)
    {
        
        lifeImg = new GreenfootImage(" " +lifeCount, 20, Color.BLACK, Color.WHITE);
        //lifeImg = new GreenfootImage(640,80);
       //GreenfootImage life = new GreenfootImage("herz.png");
       //life.drawImage(lifeImg,640,90);
       boosterpack = new BoosterPack();
       boosterpack.Image(lifeImg);
       //boosterpack.Image(life);
       addObject(boosterpack, 650, 60); 
    }
    
    public void stopped()
    {
        GameMenu.gamesound.pause();
    }

}
