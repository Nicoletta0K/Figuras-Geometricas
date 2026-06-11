package Triangulos;
public class TrianguloEscaleno extends Triangulo {
    public TrianguloEscaleno (double ladoA, double ladoB, double ladoC){
    super (ladoA, ladoB, ladoC);
}
    @Override
    protected double calcularArea(){
    double s = (ladoA+ladoB+ladoC)/2;
    return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    } 
    @Override
 public String toString () {
     return "Triangulo Escaleno { " +
         "\nLado A:  " + ladoA +
         "\nLado B:  " + ladoB +
         "\nLado C:  " + ladoC +
         "\nPerimetro:  " + getPerimetro() +
         "\nArea:  " + getArea() +
        "\n }";
 }
}