import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        exit exit =  new  exit();
        addObject(exit, 501, 492);
        exit.setLocation(507, 479);
        exit.setLocation(504, 480);
        exit.setLocation(506, 503);
        exit.setLocation(468, 498);
        exit.setLocation(480, 493);
        exit.setLocation(513, 506);
        exit.setLocation(500, 475);
        exit.setLocation(505, 515);
        exit.setLocation(499, 516);
        exit.setLocation(481, 530);
        exit.setLocation(495, 516);
        removeObject(exit);
        exit exit2 =  new  exit();
        addObject(exit2, 490, 513);
        exit2.setLocation(480, 514);
        removeObject(exit2);
        addObject(exit2, 504, 511);
    }
}

