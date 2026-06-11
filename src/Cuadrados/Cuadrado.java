package Cuadrados;
public class Cuadrado extends CuadradoRectangulo{
    public Cuadrado(double lado) {
        super(lado, lado);
    }
    @Override protected double calcularArea(){
        return Math.pow(base,2);
    }
    @Override protected double calcularPerimetro(){
        return base*4;
    }
}
