package figuras.geometricas;
import Circulos.Circulo;
public class FigurasGeometricas {
    public static void main(String[] args) {
        Circulo c1= new Circulo(2);
        c1.calcularDiametro();
        c1.calcularPerimetro();
        c1.calcularArea();  
System.out.println(c1.getRadio());
System.out.println(c1.getDiametro());
System.out.println(c1.getPerimetro());
System.out.println(c1.getArea());
        
    }
}
