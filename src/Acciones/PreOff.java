package Acciones;

import ControGeneral.Command;
import Led.Opciones;



public class PreOff extends Command {

    @Override
    public void ejecutar() {
        this.led.apagarLed();
    }

    @Override
    public void setLed(Opciones led) {
      this.led = led;
        
    }

}
