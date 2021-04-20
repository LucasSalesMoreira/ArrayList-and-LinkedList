package linkedlist;

/**
 *
 * @author Lucas Sales
 *
 **/

public class LinkedList {

    private int size = 0;
    private LinkedListNode head = null; // First element of list.
    private LinkedListNode tail = null; // Last element of list.

    public int getSize() {
        return size;
    }

    public void addLast(Object value) {
        LinkedListNode newNode = new LinkedListNode(value);

        if (isEmpty())
            head = newNode;
        else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;
    }

    public void addFirst(Object value) {
        LinkedListNode newNode = new LinkedListNode(value);

        if (isEmpty())
            tail = newNode;
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
        }

        head = newNode;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        LinkedListNode nodeAux = head;

        for (int i = 0; i < index; i++) {
            nodeAux = nodeAux.getNext();
        }

        return nodeAux.getValue();
    }

    public Object set(int index, Object value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        LinkedListNode nodeAux = head;

        Object v = get(index);

        for (int i = 0; i < index; i++) {
            nodeAux = nodeAux.getNext();
        }

        nodeAux.setValue(value);
        return v;
    }

    public void removeFirst() {
        if (head.getNext() == null) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }

        size--;
    }

    public void removeLast() {
        if (head.getNext() == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }

        size--;
    }

    // Retornar a média dos números da lista.
    public double getAverage() {
        double average = 0;
        LinkedListNode nodeAux = head;
        int contNumber = 0;

        for (int i = 0; i < size; i++) {
            String type = nodeAux.getValue().getClass().getSimpleName();
            switch (type) {
                case "Integer":
                    int nInt = (int) nodeAux.getValue();
                    average += nInt;
                    contNumber++;
                    break;

                case "Float":
                    float nFloat = (float) nodeAux.getValue();
                    average += nFloat;
                    contNumber++;
                    break;

                case "Double":
                    double nDouble = (double) nodeAux.getValue();
                    average += nDouble;
                    contNumber++;
                    break;
            }

            nodeAux = nodeAux.getNext();
        }

        average /= contNumber;

        return average;
    }

    /*
    public void printFrequency() {
        for (int i = 0; i < size - 1; i++) {
            if ((int) get(i) > (int) get(i + 1)) {
                int aux = (int) get(i + 1);
                set(i + 1, get(i));
                set(i, aux);
            }
        }
        System.out.println(this);
    }
    */

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        else {
            LinkedListNode nodeAux = head;

            for (int i = 0; i < index; i++) {
                nodeAux = nodeAux.getNext();
            }

            nodeAux.getPrev().setNext(nodeAux.getNext());
            nodeAux.getNext().setPrev(nodeAux.getPrev());

            size--;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String out_base = "LinkedList => [";
        String data = "";

        if (!isEmpty()) {
            LinkedListNode nodeAux = head; // Starting at the beginning of the list.

            for (int i = 0; i < size; i++) {
                if (i != size - 1)
                    data += String.valueOf(nodeAux.getValue()) + ", ";
                else
                    data += String.valueOf(nodeAux.getValue()) + "]";

                nodeAux = nodeAux.getNext();
            }
        } else {
            data = "]";
        }

        return out_base + data;
    }
}