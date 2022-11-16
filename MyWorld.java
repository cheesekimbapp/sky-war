import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public static Counter nyawa=new Counter("HP : ");
    public static Counter skor=new Counter("Skor : ");
    static GreenfootSound suara=new GreenfootSound ("BG2.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int type=0;
        for (int i=0;i<6;i++){
            type=Greenfoot.getRandomNumber(6);
            addObject(new alien(type,2), 640,10+Greenfoot.getRandomNumber(460));
        }
        
        Hero hero = new Hero(1);
        addObject(hero, 65, 240);
        addObject(nyawa, 240,20);
        nyawa.setValue(5);
        addObject(skor, 60, 20);
        addObject(new p2(),20+Greenfoot.getRandomNumber(1000),10);
        runBossSpawnTimer();
    }
    
    public void started(){
        suara.playLoop();
    }
    
    private int imageCount = 0;
 
    private GreenfootImage bgImage = new GreenfootImage("bg15.png");
 
    public void act() {
        imageCount -= 2; //(or any other value; small -> slow moving, big -> fast movement)
        drawBackgroundImage();
        
    }
    
    public void drawBackgroundImage() {
        if (imageCount < -bgImage.getWidth()){
            imageCount += bgImage.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(bgImage, temp, 0);
        getBackground().drawImage(bgImage, temp + bgImage.getWidth(), 0);
    }
    
    private int bossSpawnTimer = 0;
    
    private void runBossSpawnTimer(){
        // bossSpawnTimer = (bossSpawnTimer+1)%20; // adjust '300' as desired
        if (bossSpawnTimer == 0) spawnBoss();
    }
    
    private void spawnBoss(){
        bos bos = new bos();
        addObject(bos,500,240);
    }
    
}
