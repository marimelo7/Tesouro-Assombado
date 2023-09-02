import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winner extends World
{

    /**
     * Constructor for objects of class winner.
     * 
     */
    public winner()
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
        addObject(exit, 502, 509);
        exit.setLocation(516, 524);
        exit.setLocation(524, 513);
        exit.setLocation(517, 511);
        exit.setLocation(504, 502);
        exit.setLocation(485, 525);
        exit.setLocation(506, 543);
        exit.setLocation(509, 504);
        exit.setLocation(509, 496);
        exit.setLocation(523, 551);
        exit.setLocation(493, 522);
        exit.setLocation(501, 536);
        exit.setLocation(510, 536);
        exit.setLocation(515, 514);
        exit.setLocation(510, 513);
        exit.setLocation(459, 511);
        exit.setLocation(466, 507);
        exit.setLocation(451, 506);
        exit.setLocation(557, 503);
        exit.setLocation(519, 530);
        exit.setLocation(464, 539);
        exit.setLocation(490, 527);
        exit.setLocation(462, 524);
        exit.setLocation(522, 501);
        exit.setLocation(478, 509);
        exit.setLocation(508, 514);
        exit.setLocation(518, 512);
        exit.setLocation(492, 521);
        exit.setLocation(534, 519);
        exit.setLocation(494, 482);
        exit.setLocation(469, 478);
        exit.setLocation(507, 520);
        exit.setLocation(515, 533);
        exit.setLocation(526, 504);
        exit.setLocation(456, 525);
        exit.setLocation(532, 552);
        exit.setLocation(487, 536);
        exit.setLocation(531, 526);
        exit.setLocation(509, 510);
        removeObject(exit);
    }
}
