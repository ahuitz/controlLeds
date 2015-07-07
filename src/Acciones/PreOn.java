package Acciones;

import ControGeneral.Command;
import Led.Opciones;


public class PreOn extends Command {

    @Override
    public void ejecutar() {
        this.led.encenderLed();
    }

    @Override
    public void setLed(Opciones led) {
        this.led = led;
    }

  
}