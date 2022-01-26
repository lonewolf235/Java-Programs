import java.util.*;

public class reverselinked { // Reverse a linked list
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static Node insert(reverselinked list, int data) {

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
public static Node circular(reverselinked list){
    if(head==null)
    return head;
    Node p=head;
    while(p.next!=null){
        p=p.next;
    }
    p.next=head;
    return head;
}
    public static Node reverse(Node h) {
        Node curr, prev, nextnode;
        curr = h;
        prev = null;
        // nextnode = null;
        do
    {
        nextnode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextnode;
    } while (curr != h);
 
      h.next=prev;
       h=prev;
       return h;
    }

    public static void printlist(Node head) {
        Node p = head;
        while (p.next !=head ) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.print(p.data + " ");
         System.out.print(p.next.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverselinked list = new reverselinked();
        System.out.println("enter number of nodes in linkedlist");
        int n = sc.nextInt();
        while (n-- > 0) {
            insert(list, sc.nextInt());

        }
        circular(list);
        printlist(head);
        System.out.println();
       head=reverse(head);
       System.out.println("reverse");
        printlist(head);

    }

}
