/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representa un instrumento de viento, que es un tipo de instrumento musical.
 * Proporciona métodos para afinar y tocar el instrumento.
 * 
 * @author Sergio
 */
public class instrumentoDeViento extends Object implements instrumentoMusical {

    /**
     * Constructor por defecto.
     */
    public instrumentoDeViento() {
    }

    /**
     * Toca el instrumento de viento.
     */
    @Override
    public void tocar() {
       System.out.println("Tocando instrumento musical");
    }

    /**
     * Afina el instrumento de viento.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando ");
    }

    /**
     * Devuelve el tipo de instrumento.
     * 
     * @return Tipo de instrumento
     */
    @Override
    public String tipoInstrumento() {
        System.out.println("musical");
        return null;
    }

    /**
     * Devuelve una representación en cadena del instrumento de viento.
     * 
     * @return Representación en cadena del instrumento de viento
     */
    @Override
    public String toString() {
        return "instrumentoDeViento{" + '}';
    }
}
