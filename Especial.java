import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Todo lo relacionado con el poder Especial que el usuario puede disparar. 
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina
 * @version 24/05/2016
 */
public abstract class Especial extends Actor
{
    private int cont=4;
    /**
     * Act - do whatever the Especial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. Si toca el borde
     * o si el contador es mejor o igual a cero, remueve el Especial. Si toca algun 
     * objeto de tipo especial disminuye el contador.
     * 
     * @param cont. De tipo entero para contabilizar las veces que el arma especial 
     * puede actuar antes de desaparecer por contacto con la clase enemigo.
     */
    public void act() 
    {
        World world = getWorld();     
        move(15);        
        if(isAtEdge()|| cont<=0)
        {
            world.removeObject(this);
        }else{       
            if(isTouching(Enemigo.class))
            {
                if(isTouching(Jefe.class))
                {
                    cont=0;                    
                }  
                cont--;
            }
        }        
    }       
}
