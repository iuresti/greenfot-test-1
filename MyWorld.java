import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,356,218);

        Pig pig = createPigAndAddToWorld(wall, 78, 336);

        Pig pig2 = createPigAndAddToWorld(wall, 85, 98)

        Pig pig3 = createPigAndAddToWorld(wall, 200, 98)
        
        Pig pig4 = createPigAndAddToWorld(wall, 250, 25);
        
        pig.setLocation(149,224);
        pig2.setLocation(284,341);
        pig3.setLocation(190,223);
        pig4.setLocation(190,300);
        
    }
	
	public void movePig(Pig pig, int x, int y){
		pig.setLocation(x, y);
	}

    public Pig createPigAndAddToWorld(Wall wall, int x, int y){
        Pig pig = new Pig(wall); 

        addObject(pig, x, y);

        return pig;
    }
}
