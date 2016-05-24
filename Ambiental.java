import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambiental here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambiental extends Jugador
{
    private GreenfootImage imagen1;
    private GreenfootImage imagen2;
    /**
     * Constructor para un tipo especifico de jugador
     */
    public Ambiental(String nom, Character tipo)
    {
        super(nom,tipo); 
        InicializaImg(1, "AMB_1.png");
        InicializaImg(2, "AMB_2.png"); 
    }
}