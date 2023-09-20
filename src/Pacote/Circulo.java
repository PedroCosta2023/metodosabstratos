package Pacote;

public class Circulo extends Shape {
    private double raio;

    public Circulo() {
    }

    public Circulo(Color color, double raio) {
        super(color);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = Math.PI * (raio * raio);
        return area;
    }
}
