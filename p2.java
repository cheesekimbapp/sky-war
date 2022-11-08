import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2 extends Actor
{
    /**
     * Act - do whatever the p2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+2);
        if (getY()>475){
            setLocation(20+Greenfoot.getRandomNumber(600),0);
        }
        
        if(isTouching(Hero.class)){
            getWorld().addObject(new Hero(3), 240, 200);
            removeTouching(Hero.class);
            getWorld().removeObject(this);
        }
    }
}
