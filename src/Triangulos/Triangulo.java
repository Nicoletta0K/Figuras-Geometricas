package Triangulos;
import figuras.geometricas.Figuras;
public abstract class Triangulo extends Figuras{
protected double ladoA;
protected double ladoB;
protected double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }


    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
@Override
protected double calcularPerimetro(){
return ladoA+ladoB+ladoC;
}
}
