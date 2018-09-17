/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_de_Diseño;

/**
 *
 * @author ASUS
 */
public class InformacionPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona jose = Persona.getSingletonInstance("Jose Luis");
        //Persona edson = Persona.getSingletonInstance("Edson");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(jose.getClass());
        //System.out.println(ricardo.getNombre());  
    }
    
}
