import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
            {
        
                    if (Greenfoot.isKeyDown("right"))
                    {
                        setLocation (getX() + 60, getY());
                    }
                    if (Greenfoot.isKeyDown("left"))
                    {
                        setLocation (getX() - 60, getY());
                    }
            }
    }    
}
