import greenfoot.*; 

/**
 * El arma del Infocomp. Un control de xbox.
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina
 * @version 24/05/2016
 */
public class Control extends Poder1 
{
     /**
     * Constructor for objects of class Control. Inicializa las imagenes
     * que tendra el objeto.
     * @param angulo. De tipo int para indicar que tanto angulo
     * gira el arma para salir en la direccion deseada.
    */  
    public Control(int angulo)
    {
        turn(angulo);
        super.InicializaImg(1,"C_1.png");
        super.InicializaImg(2,"C_2.png");
        Greenfoot.playSound("disparo.wav");
    }
}

