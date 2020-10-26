import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StrowberryButton strowberryButton = new StrowberryButton();
        addObject(strowberryButton,91,92);
        strowberryButton.setLocation(264,175);
       
        showText("PACMAN", 200, 100);
         showText("Jose Isaias Briano Jasso", 200, 200);

    }
}
