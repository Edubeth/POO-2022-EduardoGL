package mx.uv.fiee.iinf.poo;

public class Circle implements Draw, Calculate, Comparable<Circle> {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Circle obj) {
        int equal = 0;
        if (this.calculateArea() > obj.calculateArea())
            equal = 1;
        if (this.calculateArea() < obj.calculateArea())
            equal = -1;
        return equal;
    }
}
