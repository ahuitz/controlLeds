package ControGeneral;

import Led.Opciones;
import java.util.Vector;

public abstract class Command {

    public Opciones led;
    
    public Vector nuevoLed;
    public Vector nuevoBoton;
    
    public abstract void ejecutar();
    public abstract void setLed(Opciones led);

}
