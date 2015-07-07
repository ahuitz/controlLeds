package ControGeneral;

import java.util.ArrayList;
import java.util.List;

public class Boton {

    private List<Command> opciones;

    public Boton() {
        opciones =  new ArrayList<>();
    }
    
    public void Accionar(){
        for (Command com : opciones){
            com.ejecutar();
        }
    }
    
    public void agregarComando(Command com){
        this.opciones.add(com);
    }


}
