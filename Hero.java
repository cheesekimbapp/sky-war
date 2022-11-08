import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int n;
    
    public Hero(){
        setImage("plane_1.png");
    }
    
    public Hero(int i){
        setImage("plane_"+ i +".png");
        n = i;
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
            if(timer > 10 && n == 1){
                getWorld().addObject(new Peluru(), getX(), getY());
                getWorld().addObject(new Peluru(), getX(), getY()+20);
                getWorld().addObject(new Peluru(), getX(), getY()-20);
                Greenfoot.playSound("shoot.mp3");
                timer=0;
                
            } else if (timer > 10 && n == 2){
                getWorld().addObject(new Peluru2(), getX(), getY());
                getWorld().addObject(new Peluru2(), getX(), getY()+10);
                getWorld().addObject(new Peluru2(), getX(), getY()-10);
                Greenfoot.playSound("shoot.mp3");
                timer=0;
            }
        }
    }
    
}
