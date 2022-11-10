import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bos extends Actor
{
        int bossHitPoint = 3;
    /**
     * Act - do whatever the bos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        hit();
    }
    
    void hit(){
        if(isTouching(Peluru.class)) {
            removeTouching(Peluru.class);
            bossHitPoint = bossHitPoint-1;
                if(bossHitPoint == 0){
                getWorld().removeObject(this);
                }
        }
    }
}
