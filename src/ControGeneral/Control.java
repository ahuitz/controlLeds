/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControGeneral;

import Acciones.PreOff;
import Acciones.PreOn;
import Led.Led1;
import Led.Led2;
import Led.Led3;

/**
 *
 * @author Cliente
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
      
        AsignarBoton asignar = new AsignarBoton();
        
        Led1 ledA = new Led1();
        Led2 ledB = new Led2();
        Led3 ledC = new Led3();
        
        Boton bt1 = new Boton();
        Boton bt2 = new Boton();
        
        PreOff off = new PreOff();
        PreOn on = new PreOn(); 
        PreOn on1 = new PreOn();
        
        off.setLed(ledA);
        bt1.agregarComando(off);
        on.setLed(ledB);
        bt1.agregarComando(on);
        on1.setLed(ledC);
        bt1.agregarComando(on1);
        
        asignar.agregarBoton(bt1);
        PreOff off1 = new PreOff();
        PreOn on2 = new PreOn();
        PreOff off2 =  new PreOff();
        off1.setLed(ledA);
        bt2.agregarComando(off1);
        on2.setLed(ledB);
        bt2.agregarComando(on2);
        off2.setLed(ledC);
        bt2.agregarComando(off2);
        
        asignar.agregarBoton(bt2);
        
        asignar.nBotones.get(0).Accionar();
        System.out.println("BOTON 1");
        asignar.nBotones.get(1).Accionar(); 
        System.out.println("BOTON 2");
    }
        

}
