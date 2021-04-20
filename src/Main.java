import arraylist.Lista_Array;
import linkedlist.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testList();
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        boolean controller;

        do {
            System.out.println("TESTE DE LISTA");
            System.out.println("Digite:");
            System.out.println("1 para ArrayList");
            System.out.println("2 para LinkedList");

            switch (input.nextInt()) {
                case 1:
                    testArrayList();
                    controller = true;
                    break;
                case 2:
                    testLinkedList();
                    controller = true;
                    break;
                default:
                    controller = false;
                    System.out.println("Input inválido!");
            }
        } while (!controller);
    }

    private static void testLinkedList() {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++)
            list.addLast(i * 10);

        list.addLast(10);
        list.addLast(2.5f);
        list.addLast(5);
        list.addLast("STR");
        list.addLast('L');
        list.addLast(new Random());
        list.addLast(20);
        list.addLast(25);
        list.addLast(2);
        //list.printFrequency();
        System.out.println(list.getAverage());


        System.out.println(list);
        System.out.println("Index 3 -> " + list.get(3));

        System.out.println("-----------------------------------------");

        list.addFirst("Alycia Lima");
        System.out.println(list);

        System.out.println("-----------------------------------------");

        System.out.println("Index 3 -> " + list.get(3));

        System.out.println("-----------------------------------------");

        list.set(3, "Lucas Sales Moreira Cordeiro");
        System.out.println(list);

        System.out.println("-----------------------------------------");

        list.remove(0);
        System.out.println(list);

        System.out.println("-----------------------------------------");

        list.remove(2);

        System.out.println(list);
    }

    private static void testArrayList() {
        Lista_Array lista = new Lista_Array();
        for (int i = 0; i < 150; i++) {
            lista.addLast(i);
        }

        System.out.println(lista);

        for (int i = 0; i < 5; i++) {
            lista.remove(i);
        }

        System.out.println(lista);

        for (int i = 0; i < 25; i++) {
            lista.remove(i);
        }

        System.out.println(lista);

    }
}
