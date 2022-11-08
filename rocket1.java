import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket1 extends Actor
{
    /**
     * Act - do whatever the rocket1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rocket1(){
        setImage("plane_2.png");
    }
    
    public rocket1(int i){
        setImage("plane_2"+ i +".png");
    }
    
    int timer=0;
    public void act()
    {
        control();
    }
        void control()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        } else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        } else if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        
        
        timer++;
        if (Greenfoot.isKeyDown("space")){
            if(timer > 10){
            getWorld().addObject(new Peluru2(), getX(), getY());
            Greenfoot.playSound("shoot.mp3");
            timer=0;
            }
        }
    }

}
