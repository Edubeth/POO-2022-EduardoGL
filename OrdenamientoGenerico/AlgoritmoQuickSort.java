package OrdenamientoGenerico;

public class AlgoritmoQuickSort {

    public static<E extends Number> E[] ordenar(E vector[])
    {
        quicksort(vector,0, vector.length-1);
        return vector;

    }

    public static <E extends Number> void quicksort(E A[], int izq, int der) {

        E pivote = A[izq];
        int i = izq;
        int j = der;
        E aux;

        while (i < j) {

            while (A[i].doubleValue() <= pivote.doubleValue() && i < j){

                i++;
            }

            while (A[j].doubleValue() > pivote.doubleValue()){

                j--;
            }

            if (i < j) {

                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            quicksort(A, izq, j - 1);
        }

        if (j + 1 < der) {
            quicksort(A, j + 1, der);
        }
    }
}