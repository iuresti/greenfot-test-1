import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    private int xDirection = 1;
    private int velocity = 4;
    private Actor wall;
    
    
    public Pig(Actor wall){
        this.wall = wall;
    }
    
    /**
     * Act - do whatever the Pig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        

        setLocation(x + velocity * xDirection, y);
        
        if(isAtEdge() || intersects(wall)) {
            xDirection = xDirection * -1;
        }
    }    
}
