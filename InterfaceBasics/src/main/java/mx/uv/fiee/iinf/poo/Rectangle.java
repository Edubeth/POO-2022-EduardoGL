package mx.uv.fiee.iinf.poo;

public class Rectangle implements Draw, Calculate, Comparable<Rectangle> {

    private double altura;
    private double base;

    public Rectangle(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return this.altura * this.base;
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Rectangle obj) {
        int equal = 0;
        if (this.calculateArea() > obj.calculateArea())
            equal = 1;
        if (this.calculateArea() < obj.calculateArea())
            equal = -1;
        return equal;
    }
}
