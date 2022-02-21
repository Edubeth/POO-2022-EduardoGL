package OrdenamientoGenerico;

public class Main {

    public static void main(String[] arg) {

        Integer[] intVector = { 101,99,12,19,21,111,345,25,77,81 };
        Integer[] result = AlgoritmoQuickSort.ordenar (intVector);

       Float [] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };
       Float [] resulta = AlgoritmoQuickSort.ordenar (floatVector);
/*
       String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
       String [] result = Utils.ordena (strVector);
*/
        System.out.println("vectores ordenados\n");

        for (float R:resulta){

            System.out.print(R + " - ");
        }
        System.out.println();

        for(int r:result){

            System.out.print(r + " - ");
        }
        System.out.println();
    }
}
