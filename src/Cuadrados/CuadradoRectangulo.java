package Cuadrados;
import figuras.geometricas.Figuras;
public abstract class CuadradoRectangulo extends Figuras{
    protected double base;
    protected double altura;
    protected double diagonal;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public CuadradoRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    protected double calculaPerimetro(){
    return (base*2)+(altura*2);
    }
    
    private double calcularDiagonal(){
    return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }  
public String toString () {
     return "Cuadrado Rectangulo { " +
         "\nBae:  " + base +
         "\nAltura:  " + altura +
         "\nDiagonal:  " + diagonal +
         "\nPerimetro:  " + getPerimetro() +
         "\nArea:  " + getArea() +
        "\n }";
 }
}
