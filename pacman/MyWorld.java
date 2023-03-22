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
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        addObject(new Wall(),300,50);
        addObject(new Wall(),300,350);
        addObject(new Wall(),150,50);
        addObject(new Wall(),150,350);
        addObject(new Wall(),450,50);
        addObject(new Wall(),450,350);
        Apple apple=new Apple();
        addObject(apple,100,150);
        Banana banana=new Banana();
        addObject(banana,400,120);
        Cherry cherry=new Cherry();
        addObject(cherry,300,200);

        //Smallitem smallitem=new Smallitem();
        //addObject(smallitem,302,201);

        addObject(new Pacman(),50,150);
    
}
}
