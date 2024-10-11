/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Define los métodos que deben implementar los instrumentos musicales.
 * 
 * @author Sergio
 */
public interface instrumentoMusical {
    /**
     * Método para tocar el instrumento musical.
     */
    void tocar();

    /**
     * Método para afinar el instrumento musical.
     */
    void afinar();

    /**
     * Devuelve el tipo de instrumento musical.
     * 
     * @return Tipo de instrumento
     */
    String tipoInstrumento();
}
