import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Civil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Civil extends Jugador
{
    /**
     * Constructor para un tipo especifico de jugador
     */
    public Civil(String nom, Character tipo)
    {
        super(nom,tipo); 
        super.InicializaImg(1, "CIV_1.png");
        super.InicializaImg(2, "CIV_2.png");     
    }
    
}