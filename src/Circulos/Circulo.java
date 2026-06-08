package Circulos;
import figuras.geometricas.Figuras;
public class Circulo extends Figuras {
    private double radio;
    private double diametro;
    private static final double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        this.diametro=radio*2;
        return diametro;
    }

    public static double getPI() {
        return PI;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
public double calcularPerimetro(){
this.perimetro=2*Circulo.getPI();
    
return 0;}
public double calcularArea(){
return 0;}



}
