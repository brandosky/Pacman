import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class item extends Actor
{
    
    protected int points;
    
    public item(int points){
        this.points=points;
        
    }
    /**
     * Act - do whatever the item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public int getPoints(){
        return points;
    }
}
