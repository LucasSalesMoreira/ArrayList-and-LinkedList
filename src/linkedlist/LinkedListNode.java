package linkedlist;

/**
 *
 * @author Lucas Sales Moreira Cordeiro
 *
 **/

public class LinkedListNode {
    private Object value = null;
    private LinkedListNode next = null;
    private LinkedListNode prev = null;

    protected LinkedListNode(Object value) {
        this.value = value;
    }

    protected Object getValue() {
        return value;
    }

    protected void setValue(Object value) { this.value = value; }

    protected LinkedListNode getNext() { return next; }

    protected void setNext(LinkedListNode next) {
        this.next = next;
    }

    protected LinkedListNode getPrev() { return prev; }

    protected void setPrev(LinkedListNode prev) { this.prev = prev; }
}
