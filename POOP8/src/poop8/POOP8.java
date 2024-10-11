package poop8;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Demuestra el uso de las clases Triangulo, Cuadrilatero, Flauta y la interfaz Meses.
 * 
 * @author Sergio
 */
public class POOP8 {

    private static Object Cuadrilatero;

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(60, 60, 60, 5, 5, 5, 5, 7);
        System.out.println(triangulo1);
        System.out.println("Area = " + triangulo1.area());
        System.out.println("Perimetro = " + triangulo1.perimetro());

        Cuadrilatero cuadrilatero1 = new Cuadrilatero();
        System.out.println(cuadrilatero1);

        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);

        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);
        Object object1 = new Object();
        System.out.println(object1);
        object1 = cuadrilatero2;
        System.out.println(object1);

        identificarFiguras(triangulo1);

        Flauta flauta = new Flauta();
        flauta.tocar();
        flauta.afinar();
        flauta.tipoInstrumento();

        System.out.println(Math.PI);
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
    }

    /**
     * Identifica el tipo de polígono y muestra un mensaje correspondiente.
     * 
     * @param poligono El polígono a identificar
     */
    public static void identificarFiguras(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de triangulo");
        } else if (Cuadrilatero instanceof Triangulo) {
            System.out.println("Instancia de cuadrilatero");
        } else {
            System.out.println("Instancia de poligono");
        }
    }
}
