package Pacote;

public class Retangulo extends Shape {
    //Atributos
    private double largura;
    private double altura;

    public Retangulo(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo() {
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double area() {
        double area = this.largura * this.altura;
        return area;
    }
}
