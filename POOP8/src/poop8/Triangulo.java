package poop8;

/**
 * Representa un triángulo, que es un tipo de polígono.
 * Proporciona métodos para calcular el área y el perímetro del triángulo.
 * 
 * @author Sergio
 */
public class Triangulo extends Poligono {
    private int alfa;
    private int beta;
    private int gamma;
    private float a, b, c;
    private float base, altura;

    /**
     * Constructor por defecto.
     */
    public Triangulo() {
    }

    /**
     * Constructor que inicializa todos los atributos del triángulo.
     * 
     * @param alfa Ángulo alfa del triángulo
     * @param beta Ángulo beta del triángulo
     * @param gamma Ángulo gamma del triángulo
     * @param a Lado a del triángulo
     * @param b Lado b del triángulo
     * @param c Lado c del triángulo
     * @param base Base del triángulo
     * @param altura Altura del triángulo
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el ángulo alfa del triángulo.
     * 
     * @return Ángulo alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el ángulo alfa del triángulo.
     * 
     * @param alfa Ángulo alfa
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el ángulo beta del triángulo.
     * 
     * @return Ángulo beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el ángulo beta del triángulo.
     * 
     * @param beta Ángulo beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene el ángulo gamma del triángulo.
     * 
     * @return Ángulo gamma
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Establece el ángulo gamma del triángulo.
     * 
     * @param gamma Ángulo gamma
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Obtiene el lado a del triángulo.
     * 
     * @return Lado a
     */
    public float getA() {
        return a;
    }

    /**
     * Establece el lado a del triángulo.
     * 
     * @param a Lado a
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene el lado b del triángulo.
     * 
     * @return Lado b
     */
    public float getB() {
        return b;
    }

    /**
     * Establece el lado b del triángulo.
     * 
     * @param b Lado b
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene el lado c del triángulo.
     * 
     * @return Lado c
     */
    public float getC() {
        return c;
    }

    /**
     * Establece el lado c del triángulo.
     * 
     * @param c Lado c
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene la base del triángulo.
     * 
     * @return Base
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del triángulo.
     * 
     * @param base Base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triángulo.
     * 
     * @return Altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triángulo.
     * 
     * @param altura Altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo.
     * 
     * @return Área del triángulo
     */
    @Override
    public float area() {
        return (base * altura) / 2;
    }

    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return Perímetro del triángulo
     */
    @Override
    public float perimetro() {
        return a + b + c;
    }

    /**
     * Devuelve una representación en cadena del triángulo.
     * 
     * @return Representación en cadena del triángulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
