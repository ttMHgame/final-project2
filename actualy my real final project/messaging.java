import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class messaging here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class messaging extends Actor
{
    public messaging(){
        getImage().scale(50, 50);
    }
    /**
     * Act - do whatever the messaging wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
        
        Greenfoot.setWorld(new messageHome());
    }
        
        
    }    
}
