import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backgroundCel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backgroundCel extends World
{

    /**
     * Constructor for objects of class backgroundCel.
     * 
     */
    public backgroundCel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(360, 360, 1);
        setBackground("cell.jpg");
        
        //maakt de container
        containerHor hor1 = new containerHor();
        //voegt container toe
        addObject(hor1 , 90, 30);
        
        containerHor hor2 = new containerHor();
        addObject(hor2 , 90, 330);
        
        containerVert vert1 = new containerVert();
        addObject(vert1 , 150, 150);
        
        containerVert vert2 = new containerVert();
        addObject(vert2 , 330, 90);
        
        containerHorK horK1 = new containerHorK();
        addObject(horK1 , 300, 210);
        
        containerVertK vertK1 = new containerVertK();
        addObject(vertK1 , 270, 300);
        
        containerVertK vertK2 = new containerVertK();
        addObject(vertK2 , 30, 240);
        
        player p1 = new player();
        addObject(p1, 60, 150);
    }
}
