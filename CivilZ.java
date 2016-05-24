import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo Zombie de tipo Civil. Es simplemente una clase para definir un tipo
 * diferente de enemigo; hereda de la clase Comun.
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina 
 * @version 25/05/2016
 */
public class CivilZ extends Comun
{
    public CivilZ(String nombre, Character t)
    {
        super.cambiaNombre(nombre);
        super.cambiaVida(100);
        super.InicializaImg(1, "civilz.png");
        super.InicializaImg(2, "civilz.png");
        super.setTipo(t);
        setRotation(180); 
        Greenfoot.playSound("z.wav");
    }  
}
