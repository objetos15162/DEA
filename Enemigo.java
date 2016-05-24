import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para definir al enemigo, sus movimientos, sus imagenes y atributo.
 * 
 * @author Luis Carlos Bacasehua Morales & Raúl Marván Medina 
 * @version 24/05/2016
 */
public abstract class Enemigo extends Personaje
{
    private Character tipo;//Tipo de enemigo
    private GreenfootImage imagen1;
    private GreenfootImage imagen2;
    private int cont = 0,band=0; 
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */     
    public void act() 
    {
        World w=getWorld();
        move(2);        
        golpeEnemigo();
        golpeEspecial();
        tocaJugador();         
        if (band==1)
        {
            super.cambiaVida(0);
            w.removeObject(this);
        }
               
        if(getImage() == DaImagen1())
           CambiaImagen(DaImagen2());
        else
           CambiaImagen(DaImagen1());
            
    }  
    /**
     * Método que nos informa sobre si el enemigo fue golpeado por un poder del 
     * jugador. De ser así su vida se actualiza con un -10. 
     * Sí su vida es menor a 0, entonces se activa una bandera para señalar que se 
     * debe de remover del juego.
     */
    private void golpeEnemigo(){
        if(isTouching(Poder1.class)) //Si el poder toca al enemigo 
            super.cambiaVida(super.dameVida() - 10); //Baja vida en 10
            
        if(super.dameVida()<=0)
            band=1;

    }
    /**
     * Método para verificar si el poder especial de jugador ha golpeado al enemigo.
     * De ser así su vida se actualiza con un -100. 
     * Sí su vida es menor a 0, entonces se activa una bandera para señalar que se 
     * debe de remover del juego
     */
    private void golpeEspecial(){
        if(isTouching(Especial.class)) //Si poder especial lo toca
            {
                if(tipo=='j')   //Si enemigo es de tipo jefe, le baja 100
                    super.cambiaVida(super.dameVida() - 100);
                else //Si no, lo remueve directo
                    band=1;     
           }      
    }
    /**
     * Método que nos informa si nuestra clase Enemigo ha tocado a la clase jugador.
     */
    private void tocaJugador(){
        if(isAtEdge() || isTouching(Jugador.class) && band==0)
        {
            if(isTouching(Jugador.class) && cont==1 &&band==0)
            {
               cont=0;
               band=1;
            } 
            else
                if(isAtEdge())
                    band=1;        
         cont++;
         }
    }
    /**
     * Método de acceso a la imagen
     */
        public GreenfootImage DaImagen1()
    {
        return imagen1;
    }
    
    public GreenfootImage DaImagen2()
    {
        return imagen2;
    }
    
    public void CambiaImagen(GreenfootImage im)
    {
        setImage(im);
    }
    
    public void InicializaImg(int band, String im)
    {
        switch(band)
        {
            case 1: imagen1 = new GreenfootImage(im);
            break;
            case 2: imagen2 = new GreenfootImage(im);
            break;
        }
    }
    
    public void setTipo(char t)
    {
        tipo = t;
    }
}
