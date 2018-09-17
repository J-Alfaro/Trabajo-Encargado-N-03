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
public class Persona {
    private String nombre;
    private static Persona uniconombre;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Persona getSingletonInstance(String nombre) {
        if (uniconombre == null){
            uniconombre = new Persona(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return uniconombre;
    }
    
}
