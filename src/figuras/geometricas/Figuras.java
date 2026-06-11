package figuras.geometricas;
public abstract class Figuras {
    public double getArea() {
        return calcularArea();
    }
    public double getPerimetro() {
        return calcularPerimetro(); 
    }
    protected abstract double calcularPerimetro();
    protected abstract double calcularArea();
}
