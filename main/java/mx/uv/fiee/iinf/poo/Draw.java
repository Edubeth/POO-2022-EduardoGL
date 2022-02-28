package mx.uv.fiee.iinf.poo;

public interface Draw {
    int RED     = 1;
    int GREEN   = 2;
    int BLUE    = 3;
    int BLACK   = 4;
    int WHITE   = 5;

    void draw (int color);
    void fill (int color);
}
