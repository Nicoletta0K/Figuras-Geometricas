package Triangulos;
public class TrianguloIsoceles extends Triangulo {
    public TrianguloIsoceles (double ladoAB, double ladoC){
    super (ladoAB, ladoAB, ladoC);
    }
    @Override
    protected double calcularArea(){
    return ladoC*(Math.sqrt(4*Math.pow(ladoA,2)-Math.pow(ladoC,2))/4);
    }
        @Override
 public String toString () {
     return "Triangulo Isoceles { "  +
         "\nLado A:  " + ladoA +
         "\nLado B:  " + ladoB +
         "\nLado C:  " + ladoC +
         "\nPerimetro:  " + getPerimetro() +
         "\nArea:  " + getArea() +
         "\n }";
 }
}