/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipioSolid;

/**
 *
 * @author ASUS
 */
public class Vehiculo {
       public int getNumeroRuedas() {
        return 4;
    }
 
    public int getmaximavelocidad() {
        return 200;
    }
 
    @Override public String toString() {
        return "Numero de Ruedas=" + getNumeroRuedas()+ ", Maxima velocidad=" + getmaximavelocidad();
    }
 
    public void print() {
        System.out.println(toString());
    }
}
