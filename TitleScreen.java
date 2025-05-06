import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Kung
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user preses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,454,102);
        elephant.setLocation(503,133);
        elephant.setLocation(516,139);
        elephant.setLocation(490,115);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,286,303);
        elephant.setLocation(295,108);
        label.setLocation(321,305);
        label.setLocation(289,313);
        elephant.setLocation(314,115);
        elephant.setLocation(294,111);
        label.setLocation(354,318);
        label.setLocation(340,317);
        label.setLocation(288,315);
        label.setLocation(310,318);
        label.setLocation(298,311);
        elephant.setLocation(308,125);
        elephant.setLocation(312,125);
        elephant.setLocation(312,94);
        label.setLocation(307,307);
        Label label2 = new Label("Press <空白鍵> to Start ", 40);
        addObject(label2,298,355);
        label2.setLocation(454,358);
        label2.setLocation(305,352);
        label2.setLocation(404,357);
        label2.setLocation(317,353);
    }
}
