/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Led;

/**
 *
 * @author Cliente
 */
public class Led1 implements Opciones{

    @Override
    public void encenderLed() {
        System.out.println("Led1 encendido");
    }

    @Override
    public void apagarLed() {
        System.out.println("Led1 apagado");
    }
    
}
