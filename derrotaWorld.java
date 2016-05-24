import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase derrotaWorld nos sirve para mostrar una pantalla al momento de que el jugador
 * se queda sin vida y por lo tanto ha perdido la partida.
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina
 * @version 24/05/2016
 */
public class derrotaWorld extends World
{
    private GreenfootSound song;
    /**
     * Constructor for objects of class worldVictoria.
     * 
     * @param s, de tipo GreenfootSound, el metodo recibe como parametro el sonido que 
     * emitirá al momento de poner en pantalla la imagen de derrota.
     */
    public derrotaWorld(GreenfootSound s)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        song = s;
    }
    /**
     * El metodo act funciona para mostrar en patalla el texto mientras no se 
     * presione la tecla espacio.
     */
    public void act()
    {
        showText("Presiona espacio para continuar",450,550);
        if(Greenfoot.isKeyDown("SPACE"))
            Greenfoot.setWorld(new worldMenu(song));
    }
}