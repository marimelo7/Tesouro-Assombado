import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baú here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baú extends Actor
{
    /**
     * Act - do whatever the baú wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Bob.class)) {
            setImage("baú aberto.png");
            Greenfoot.delay(35);
            Greenfoot.setWorld( new  winner());
            Greenfoot.stop();
        }
    }
}
