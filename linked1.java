class linked1
{
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
   
    void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
    }
    public static void main(String[] args)
    {
        /* Start with the empty list */
        linked1 llist = new linked1();
 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
 
        llist.deleteNode(4);  // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
}