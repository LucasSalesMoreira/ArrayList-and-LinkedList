import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++)
            list.addLast(i * 10);

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

        list.remove(9);

        System.out.println(list);
    }
}
