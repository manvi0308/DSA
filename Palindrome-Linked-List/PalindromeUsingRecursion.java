
public class PalindromeUsingRecursion {

    Node head;
    Node left;
    Node secondHalf = head;

    // Insertion at Last
    public void insertAtLast(int data) {
        // Make a new node
        Node newNode = new Node(data);
        // if this is the first node
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        // return;
    }

    // A utility function to print the Linked List
    public void printList(Node head) {
        System.out.println("Printing the Linked List");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // To check if Linked List is palindrome

    boolean isPalindrome(Node right) {
        left = head;

        // if the right pointer is null or the
        // end of list has been reached
        if (right == null)
            return true;

        // Recursively calling for the list starting from
        // left and ending at one position ahead of right
        boolean res = isPalindrome(right.next);

        if (res == false) {
            return false;
        }

        // checking if the left and right contains
        // same data
        boolean res1 = (right.data == left.data);

        left = left.next;

        return res1;

    }

    public static void main(String[] args) {
        PalindromeUsingRecursion ll = new PalindromeUsingRecursion();
        ll.head = new Node(1);
        ll.insertAtLast(2);
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(1);

        ll.printList(ll.head);
        if (ll.isPalindrome(ll.head))
            System.out.println("Palindrome Linked List");
        else
            System.out.println("Not a Palindrome Linked List");

    }
}