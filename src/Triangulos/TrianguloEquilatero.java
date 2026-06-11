package Triangulos;
import Triangulos.Triangulo;
public class TrianguloEquilatero extends Triangulo {
public TrianguloEquilatero(double lado){
super (lado, lado, lado);
}
@Override
protected double calcularArea(){
return (Math.sqrt(3)/4)*Math.pow(ladoA, 2);
}
    @Override
 public String toString () {
    return  "Triangulo Equilatero{"  + 
         "\nLado A:  " + ladoA +
         "\nLado B:  " + ladoB +
         "\nLado C:  " + ladoC +
         "\nPerimetro:  " + getPerimetro() +
         "\nArea:  " + getArea() +
         "\n}";
}
}
