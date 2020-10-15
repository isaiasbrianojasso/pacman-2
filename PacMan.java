import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends Person
{
    private static final int INITIAL_LIFES = 3;
    private static final int INITIAL_POINTS = 0;
    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    
    private int lifes;
    private int points;
    
    public PacMan()
    {
        sprites = new GreenfootImage[2];
        sprites[0] = new GreenfootImage("images/pacman-open.png");
        sprites[1] = new GreenfootImage("images/pacman-close.png");
        
        lifes = INITIAL_LIFES;
        points = INITIAL_POINTS;
    }
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(delaySprite >= ITERATIONS_TO_CHANGE_SPRITE)
        {
           currentSprite = (++currentSprite) % sprites.length;
           setImage(sprites[currentSprite]);

           delaySprite = 0;
        }
        
        delaySprite++;
        setLocation(getX()+1, getY());
    }    
}
