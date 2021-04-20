package arraylist;

/**
 *
 * @author Andrea Alves
 *
 **/

public class Lista_Array {
    private double[] vet;
    private int max, livre;

    public Lista_Array() {
        max = 1000;
        vet = new double[max];
        livre = 0;
    }

    public Lista_Array(int maxElementos) {
        max = maxElementos;
        vet = new double[max];
        livre = 0;
    }

    public void addLast(double v) {
        if (livre < max) {
            vet[livre] = v;
            livre++;
        } else
            System.out.println("Lista cheia!!!");
    }

    public double get(int i) {
        // conferir se a lista está vazia e se possui espaço livre
        if (i >= 0 && i < (vet.length - 1)) {
            return vet[i];
        } else {
            System.out.println("Este índice não consta da lista!!!");
            return 0;
        }
    }

    public int size() {

        if (livre == 0) {
            System.out.println("A lista está vazia.");
            return 0;

        } else if (livre >= 0 && livre < (vet.length - 1)) {
            return livre - 1;

        }
        System.out.println("A lista está cheia.");
        return max;
    }

    public double getLast() {
        // implementar
        if (size() != 0) {
            return vet[livre - 1];
        } else {
            System.out.println("Lista vazia!!!");
            return 0;
        }
    }

    public double getFirst() {
        // implementar
        if (size() != 0) {
            return vet[0];
        } else {
            System.out.println("Lista vazia!!!");
            return 0;
        }
    }

    public double remove(int i) {
        i = livre - 1; // && i >= 0
        if (size() == 0) {
            System.out.println("A lista está vazia.");
            return 0;
        }
        livre = -1;
        return i;
    }
}