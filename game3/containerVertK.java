import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containerVertK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class containerVertK extends Actor
{
    /**
     * Act - do whatever the containerVertK wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
            {
        
                    if (Greenfoot.isKeyDown("down"))
                    {
                        setLocation (getX(), getY() + 60);
                    }
                    if (Greenfoot.isKeyDown("up"))
                    {
                        setLocation (getX(), getY() - 60);
                    }
            }
    }    
}
