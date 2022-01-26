import java.util.*;
public class reversecircularlist {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static Node insert(reversecircularlist list, int data) {

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
    public static Node reverse(Node h) {
        Node curr, prev, nextnode;
        curr = h;
        prev = null;
        if(h==null)
        return null;
        // nextnode = null;
        while (curr.next != h) {
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
       h.next=prev;
       h=prev;
       return h;
    }

    static void printList(Node head)
    {
        if (head == null)
            return;
     
        Node temp = head;
        do
        {
            System.out.print( temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reversecircularlist list = new reversecircularlist();
        System.out.println("enter number of nodes in linkedlist");
        int n = sc.nextInt();
        while (n-- > 0) {
            insert(list, sc.nextInt());

        }
        System.out.println("helo");
        printList(head);
        // head = reverse(head);
        System.out.println("reverse");
        printList(head);

    }
}
