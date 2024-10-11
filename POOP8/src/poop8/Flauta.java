/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representa una flauta, que es un tipo de instrumento de viento.
 * Proporciona métodos para afinar y tocar la flauta.
 * 
 * @author Sergio
 */
public class Flauta extends instrumentoDeViento {

    /**
     * Constructor por defecto.
     */
    public Flauta() {
    }

    /**
     * Devuelve una representación en cadena de la flauta.
     * 
     * @return Representación en cadena de la flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }

    /**
     * Devuelve el tipo de instrumento.
     * 
     * @return Tipo de instrumento
     */
    @Override
    public String tipoInstrumento() {
        return "Flauta";
    }

    /**
     * Afina la flauta.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando flauta");
    }

    /**
     * Toca la flauta.
     */
    @Override
    public void tocar(){
        System.out.println("Tocando flauta");
    }
}
