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
        addObject(hero, 30, 240);
        addObject(nyawa, 240,20);
        nyawa.setValue(5);
        addObject(skor, 60, 20);
      
        int timer=0;
        addObject(new p1(),20+Greenfoot.getRandomNumber(1000),10);
        if (timer == 100){
            
        }
    }
    public void started(){
        suara.playLoop();
    }
}
