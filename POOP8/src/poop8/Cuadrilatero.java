/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representa un cuadrilátero con sus lados, base, altura y ángulos.
 * Proporciona métodos para calcular el perímetro y el área del cuadrilátero.
 * 
 * @author Sergio
 */
public class Cuadrilatero {

    private float a, b, c, d;
    private float base, altura;
    private float alfa, beta;
    
    /**
     * Constructor por defecto.
     */
    public Cuadrilatero(){
        
    }
    
    /**
     * Constructor que inicializa todos los atributos del cuadrilátero.
     * 
     * @param a Lado a del cuadrilátero
     * @param b Lado b del cuadrilátero
     * @param c Lado c del cuadrilátero
     * @param d Lado d del cuadrilátero
     * @param base Base del cuadrilátero
     * @param altura Altura del cuadrilátero
     * @param alfa Ángulo alfa del cuadrilátero
     * @param beta Ángulo beta del cuadrilátero
     */
    public Cuadrilatero(float a, float b, float c, float d, float base, float altura, float alfa, float beta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
        this.alfa = alfa;
        this.beta = beta;
    }

    /**
     * Obtiene el lado a del cuadrilátero.
     * 
     * @return Lado a
     */
    public float getA() {
        return a;
    }

    /**
     * Establece el lado a del cuadrilátero.
     * 
     * @param a Lado a
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene el lado b del cuadrilátero.
     * 
     * @return Lado b
     */
    public float getB() {
        return b;
    }

    /**
     * Establece el lado b del cuadrilátero.
     * 
     * @param b Lado b
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene el lado c del cuadrilátero.
     * 
     * @return Lado c
     */
    public float getC() {
        return c;
    }

    /**
     * Establece el lado c del cuadrilátero.
     * 
     * @param c Lado c
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene el lado d del cuadrilátero.
     * 
     * @return Lado d
     */
    public float getD() {
        return d;
    }

    /**
     * Establece el lado d del cuadrilátero.
     * 
     * @param d Lado d
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Obtiene la base del cuadrilátero.
     * 
     * @return Base
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del cuadrilátero.
     * 
     * @param base Base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del cuadrilátero.
     * 
     * @return Altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cuadrilátero.
     * 
     * @param altura Altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del cuadrilátero.
     * 
     * @return Perímetro
     */
    public float perimetro(){
        return a + b + c + d;
    }
    
    /**
     * Calcula el área del cuadrilátero.
     * 
     * @return Área
     */
    public float area(){
        return base * altura;
    }

    /**
     * Obtiene el ángulo alfa del cuadrilátero.
     * 
     * @return Ángulo alfa
     */
    public float getAlfa() {
        return alfa;
    }

    /**
     * Establece el ángulo alfa del cuadrilátero.
     * 
     * @param alfa Ángulo alfa
     */
    public void setAlfa(float alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el ángulo beta del cuadrilátero.
     * 
     * @return Ángulo beta
     */
    public float getBeta() {
        return beta;
    }

    /**
     * Establece el ángulo beta del cuadrilátero.
     * 
     * @param beta Ángulo beta
     */
    public void setBeta(float beta) {
        this.beta = beta;
    }

    /**
     * Devuelve una representación en cadena del cuadrilátero.
     * 
     * @return Representación en cadena del cuadrilátero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + ", alfa=" + alfa + ", beta=" + beta + '}';
    }
}
