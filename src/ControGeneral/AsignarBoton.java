/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControGeneral;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 *
 * @author Cliente
 */
public class AsignarBoton {
    
    public List<Boton> nBotones;
    
    public Vector boton;
    public Vector manejo;
    
    public AsignarBoton(){
        nBotones = new ArrayList<>();
    }
    
    public void agregarBoton(Boton bot){
        nBotones.add(bot);
    }
}
