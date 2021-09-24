public class Deletion {
    // Function to delete a node in a doubly linked lists
    // head: head of the doubly linked list
    // del: node to be deleted
    public static void deleteNode(Node head, Node del) {
        // if the node to be deleted is head
        // then change head
        if (head == del) {
            head = del.next;
        }

        // Before deleting the node,
        // make sure that the next node is
        // pointing to the previous node
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        // Before deleting the node,
        // make sure that the previous node is
        // pointing to the next node
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        // Finally, delete the node
        del = null;
    }
}
