import java.util.Scanner;

public class Linkedlistfull {// main class of linkedlist
    static Node head; // Head of linkedlist of class type node.

    static class Node { // Node class to create a node.
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node insert(Linkedlistfull list, int data) { // Function for inserting nodes in list.Returns head of
                                                               // list.

        if (head == null) {
            head = new Node(data);
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new Node(data);

        }

        return head;
    }

    public static void printlist(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlistfull list = new Linkedlistfull();
        insert(list, 14);
        insert(list, 12);
        insert(list, 16);
        insert(list, 19);
        printlist(head);
    }
}
