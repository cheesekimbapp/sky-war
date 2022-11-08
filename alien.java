import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien extends Actor
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=1;
    int health;
    
    public alien()
    {
        setImage("Alien0.png");
    }
    
    public alien(int i, int hp)
    {
        setImage("Alien"+i+".png");
        speed = i+1;
    }
   
    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX()<10){
            setLocation(640, 20+Greenfoot.getRandomNumber(440));
        }
        meledak();
    }
    
    void meledak()
    {
        if(isTouching(Peluru.class)) {
            removeTouching(Peluru.class);
            speed=speed-1;
            if(speed<=0){
                mledos();
                MyWorld.skor.add(1);
                getWorld().removeObject(this);
            }
        }else if(isTouching(Peluru2.class)) {
            removeTouching(Peluru2.class);
            speed=speed-1;
            if(speed<=0){
                mledos();
                MyWorld.skor.add(1);
                getWorld().removeObject(this);
            }
        } else if(isTouching(Hero.class)) {
            removeTouching(Hero.class);
            mledos();
            MyWorld.nyawa.add(-1);
        
        if(MyWorld.nyawa.getValue()==0) {
            getWorld().addObject(new Gameover(), 150, 250);
            Greenfoot.stop();
        }
        
        getWorld().addObject(new Hero(1), 240, 200);
        getWorld().removeObject(this);
        }
    }

    void mledos()
    {
        int type= Greenfoot.getRandomNumber(6);
        getWorld().addObject(new Boom(), getX(), getY());
        getWorld().addObject(new alien(type,2),20+Greenfoot.getRandomNumber(1000), 0);
        Greenfoot.playSound("blast.wav");
        Greenfoot.playSound("hit.wav");
    }
}
