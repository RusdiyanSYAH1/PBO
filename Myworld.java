import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{

    /**
     * Constructor for objects of class myworld.
     * 
     */
    public Myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Plane player1 = new Plane();
        this.addObject(player1, 30 , 200);
        player1.setName("player1");
        
        Plane player2 = new Plane();
        player2.setRotation(180);
        player2.setName("player2");
        this.addObject(player2, 570, 200);
        
        Plane player3 = new Plane();
        player3.setRotation(270);
        player3.setName("player3");
        this.addObject(player3, 300, 370);
        
        Plane player4 = new Plane();
        player4.setRotation(90);
        player4.setName("player4");
        this.addObject(player4, 300, 30);
    }
}
