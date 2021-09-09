/* 
This approach uses stack to check if a linked list is palindrome
*/
import java.util.Stack;

class Node {
  int data;
  Node next;

  Node(int value) {
    data = value;
    next = null;
  }
}

public class Palindrome {
  Node head;

  // Utitlity function to insert a node at the last
  public void insertAtLast(int data) {
    // Making a new node
    Node newNode = new Node(data);
    // if this is the first node
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = null;

    // if its not the fist node, then traverse the
    // complete linked list till the end
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  // A utiltity funtion to print the linked list
  public void printList(Node head) {
    System.out.println("Printing the linked list");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

    System.out.println();
  }

  // Function to check if linked list is palindrome
  public boolean isPalindrome(Node head) {
    Stack<Integer> myStack = new Stack<>();
    Node temp = head;
    boolean status = false;

    // Pushing the elements of Linked List to stack
    while (temp != null) {
      myStack.push(temp.data);
      temp = temp.next;
    }
    temp = head;

    while (temp != null) {
      int element = myStack.pop();
      if (temp.data == element) {
        status = true;
        temp = temp.next;
      } else {
        status = false;
        break;
      }
    }

    return status;

  } // isPalindrome function ends here

  public static void main(String[] args) {
    Palindrome ll = new Palindrome();
    // 1->Null
    ll.head = new Node(1);
    // 1->2->Null
    ll.insertAtLast(2);
    // 1->2->1->Null
    ll.insertAtLast(1);
    // 1->2->1->2->Null
    ll.insertAtLast(2);
    // 1->2->1->2->1->Null
    ll.insertAtLast(1);

    ll.printList(ll.head);
    if (ll.isPalindrome(ll.head)) {
      System.out.println("Palindrome Linked List");
    } else {
      System.out.println("Not a Palindrome Linked List");
    }

    Palindrome ll2 = new Palindrome();
    ll2.head = new Node(4);
    ll2.insertAtLast(2);
    ll2.insertAtLast(5);
    ll2.insertAtLast(6);
    ll2.printList(ll2.head);
    if (ll2.isPalindrome(ll2.head)) {
      System.out.println("Palindrome Linked List");
    } else {
      System.out.println("Not a Palindrome Linked List");
    }

  }
}