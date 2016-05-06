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
    private BoosterFactory boosterFactory;
    
    private EPosition eP;
    private IPosition iP;
    private PositionX xP;
    private PositionY yP;
    
    private int[] x;
    private int[] y;
    private int[] xL;
    private int[] yL;
       
    private BulletBooster[] boosters;
    private LifeLine[] lives;
    
    private GreenfootImage bg;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        hero = new Hero();
        addObject(hero, 400, 300);
        bg = getBackground();
        bg.setFont(new Font("SERIF", Font.BOLD, 24));
        bg.setColor(Color.white);        
       // bg.drawString("Lifes: ", 50, 40);
        //addLife(3);
        bg.drawString("Kills: ", 600, 40); 
        setKill(0);
        LifeLine.ResetLifeBoosterCount();
        BulletBooster.ResetBulletBoosterCount();
        boosterFactory = new BoosterFactory();
        boosterpack = boosterFactory.GetBooster(GameEnum.BoosterTypes.BOOSTER);
        buletbooster =(BulletBooster) boosterFactory.GetBooster(GameEnum.BoosterTypes.BULLET);
        lifeLineBooster = (LifeLine) boosterFactory.GetBooster(GameEnum.BoosterTypes.LIFE);
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
    
    public Hero GetHero()
    {
        return hero;
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
         boosters=new BulletBooster[5];
        x=new int[10]; 
        y=new int[10];
        
        for (int i=0 ; i < 4 ; i++)
         {
                GreenfootImage bulletImg =new GreenfootImage("ammunition-icon.png");
                boosters[i] = new BulletBooster();
                boosters[i].Image(bulletImg);
                x[i]=getRandomNumber(50,1000);
                y[i]=getRandomNumber(0,1000);
                addObject(boosters[i],x[i],y[i]); 
        
         }        
    }
     
     public void addLifeBoosterToWorld()
    {
        int xcord = 640;
        int ycord = 500;
        xL=new int[10]; 
        yL=new int[10];
        lives=new LifeLine[5];
        
        for (int i=0 ; i < 3 ; i++)
        {
                GreenfootImage lifelineimg =new GreenfootImage("power.png");
                lives[i] = new LifeLine();
                lives[i].Image(lifelineimg);
                xL[i]=getRandomNumber(50,1000);
                yL[i]=getRandomNumber(0,1000);
                addObject(lives[i],xL[i],yL[i]); 
        
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
       // bg.drawString("Lifes: ", 50, 40);
       // bg.drawString(""+lifes, 130, 40);     
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
        
        ImageClassA ic = new ImageClassA();
        
        Zombie zom = new Zombie("zommy_converted.png");
        ZombieNew zomn = new ZombieNew("zomlunna.png");
        if(Greenfoot.getRandomNumber(80) <= 50)
        {   
            if(getObjects(Zombie.class).size()<20){
                zom.accept(ic);
                addObject(zom,x,y);            
                if(numberOfObjects()<30||getObjects(ZombieNew.class).size()==0){
                    zomn.accept(ic);
                    addObject(zomn,x,y);
                }
            }           
        }
        zom.turnTowards(400, 300);
        zomn.turnTowards(400, 300);
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
    
        for(int i=0;i<4;i++)
    {       
       removeObject(boosters[i]);
 
        if(!boosters[i].unUsed())
        addObject(boosters[i],x[i]+t,y[i]);
    }
     
     
        for(int i=0;i<3;i++)
    {      
       removeObject(lives[i]);
 
        if(!lives[i].unUsed())
        addObject(lives[i],xL[i]+t,yL[i]);
    } 
    
    persistText();
  
}
    
    public void setKill(int kill)
    {
        kills += kill; // increment kill      
        GreenfootImage bg2 = new GreenfootImage(bg);                    
        bg2.setFont(new Font("SERIF", Font.BOLD, 24));
        bg2.setColor(Color.white);
        bg2.drawString(""+kills, 675, 40);
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
        boosterpack = boosterFactory.GetBooster(GameEnum.BoosterTypes.BOOSTER);
        boosterpack.Image(boosterImg);
        addObject(boosterpack, 750, 60); 
    }
    
     public void UpdateWorldLifeBooster(int lifeCount)
    {
        
       lifeImg = new GreenfootImage(" " +lifeCount, 20, Color.BLACK, Color.WHITE);
       boosterpack = boosterFactory.GetBooster(GameEnum.BoosterTypes.BOOSTER);
       boosterpack.Image(lifeImg);
       addObject(boosterpack, 650, 60); 
    }
    
    public void stopped()
    {
        GameMenu.gamesound.pause();
        GameMenu.zombiesSound.pause();
    }

}
