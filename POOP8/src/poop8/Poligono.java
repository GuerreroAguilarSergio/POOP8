/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representa un polígono abstracto con métodos para calcular el área y el perímetro.
 * Las clases que extiendan esta clase deben proporcionar implementaciones para los métodos abstractos.
 * 
 * @author Sergio
 */
public abstract class Poligono {

    /**
     * Constructor por defecto.
     */
    public Poligono() {
    }
    
    /*
    public float area(){
        return 0f; 
    }
    
    public float perimetro(){
        return 0f;
    }*/
    
    /**
     * Calcula el área del polígono.
     * 
     * @return Área del polígono
     */
    public abstract float area();

    /**
     * Calcula el perímetro del polígono.
     * 
     * @return Perímetro del polígono
     */
    public abstract float perimetro();
    
    /**
     * Devuelve una representación en cadena del polígono.
     * 
     * @return Representación en cadena del polígono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
