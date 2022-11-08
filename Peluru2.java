import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru2 extends Actor
{
    /**
     * Act - do whatever the Peluru2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+6, getY());
        if (getX()>600){
            getWorld(). removeObject(this);
        }
    }
}
