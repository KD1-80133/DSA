package assignment04_01;

public class LinearLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            data = value; 
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinearLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node trav = head;
            while (trav.next != tail) {
                trav = trav.next;
            }
            tail = trav;
            tail.next = null;
        }
    }

    public void display() {
        Node trav = head;
        System.out.println("List:");
        while (trav != null) {
            System.out.print(" " + trav.data);
            trav = trav.next;
        }
        System.out.println("");
    }
}
