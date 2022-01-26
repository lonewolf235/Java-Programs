import java.util.*;

public class circularlist {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static Node insert(circularlist list, int data) { // Function for inserting nodes in list.Returns head of
        // list.

        if (head == null) {
            head = new Node(data);
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new Node(data);
            p.next.next = head;

        }

        return head;
    }

    static void deleteNode(int position) {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }

    public static void printlist(Node head) {
        Node p = head;
        while (p.next != head) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println(p.data +" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularlist list = new circularlist();
        System.out.println("enter number of nodes in linkedlist");
        int n = sc.nextInt();
        while (n-- > 0)

        {
            insert(list, sc.nextInt());
        }
        printlist(head);
        System.out.println("enter the node position you want to delete");
        deleteNode(sc.nextInt());
        printlist(head);
    }
}
