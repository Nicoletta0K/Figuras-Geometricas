package Circulos;
import figuras.geometricas.Figuras;
public class Circulo extends Figuras {
    private double radio;
    private static final double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
 private double calcularDiametro(){
 return radio*2;
 }
    protected double calcularPerimetro(){;
    return 2*Circulo.PI*this.radio;
}
protected double calcularArea(){
    return Math.pow(radio,2)*Circulo.PI;
  }
    @Override
    public String toString() {
        return "Circulo{/nradio: " + radio +
                "/nDiametro: " +  getDiametro() + 
                "/nCircunferencia: " + getPerimetro() +
                "/nArea: " + getArea() + 
                "/n}";    
                };
    }
