import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo Zombie de tipo Ambiental. Es simplemente una clase para definir un tipo
 * diferente de enemigo; hereda de la clase Comun.
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina 
 * @version 25/05/2016
 */
public class AmbientalZ extends Comun
{  
    /**
     * Act - do whatever the AmbientalZ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AmbientalZ(String nombre, Character t)
    {
        super.cambiaNombre(nombre);
        super.cambiaVida(100);
        super.InicializaImg(1, "ambz.png");
        super.InicializaImg(2, "ambz.png");
        super.setTipo(t);
        setRotation(180);
        Greenfoot.playSound("z.wav");
    }      
}

